package com.usoit.booking.services.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.travelport.schema.common_v50_0.ActionStatus;
import com.travelport.schema.common_v50_0.BillingPointOfSaleInfo;
import com.travelport.schema.common_v50_0.BookingTraveler;
import com.travelport.schema.common_v50_0.SSR;
import com.travelport.schema.universal_v50_0.AirCreateReservationReq;
import com.usoit.booking.models.Traveler;
import com.usoit.booking.models.request.BookAirSolution;
import com.usoit.booking.models.request.BookingRequest;
import com.usoit.booking.models.request.BookingTravelerReq;
import com.usoit.booking.services.BookingRequestMapper;
import com.usoit.booking.services.PaymentInfMapper;
import com.usoit.booking.services.PricingSolutionMapper;

@Service
@EnableConfigurationProperties
@ConfigurationProperties("air")
public class BookingRequestMapperImpl implements BookingRequestMapper {

	/** The branch. */
	@Value("${air.branch}")
	private String branch;

	/** The core. */
	@Value("${air.core}")
	private String core;

	@Autowired
	private PricingSolutionMapper priceSolutionMapper;

	@Autowired
	private PaymentInfMapper paymentInfMapper;

	@Override
	public AirCreateReservationReq mappReservationReq(BookingRequest bookingRequest) {

		AirCreateReservationReq airCreateReservationReq = new AirCreateReservationReq();

		if (bookingRequest != null) {

			airCreateReservationReq.setTargetBranch(branch);
			airCreateReservationReq.setTraceId(bookingRequest.getTraceId());

			

			if (bookingRequest.getBookAirSolution() != null) {

//				System.out.println("BookAirSolution Run !! & Size: " + bookingRequest.getBookAirSolution().size());

				airCreateReservationReq.setProviderCode("1G");
				
				// Add All Traveler Info
				addBookingTravelers(airCreateReservationReq, bookingRequest);

				for (BookAirSolution solution : bookingRequest.getBookAirSolution()) {

					System.out.println("getBookAirSolution Foreach !! " + solution.toString());

					airCreateReservationReq.getAirPricingSolution().add(priceSolutionMapper
							.mapBookSolutionToReqAirSolution(solution, airCreateReservationReq.getBookingTraveler()));
				}

			}

			if (bookingRequest.getBookingPaymentInf() != null) {
				airCreateReservationReq.getFormOfPayment()
						.add(paymentInfMapper.mappFormPayment(bookingRequest.getBookingPaymentInf()));
			}
			

			airCreateReservationReq.setBillingPointOfSaleInfo(mapBillingPointOfSale());
			// airCreateReservationReq.getActionStatus().add(mapActionStatus());

		}

		return airCreateReservationReq;
	}

	/**
	 * Add Each Traveler To Reservation Request
	 * 
	 * @param airCreateReservationReq
	 * @param bookingRequest
	 */
	private void addBookingTravelers(AirCreateReservationReq airCreateReservationReq, BookingRequest bookingRequest) {

		if (bookingRequest != null) {

			for (BookingTravelerReq traveler : bookingRequest.getBookingTravelerReq()) {

				UUID uuid = UUID.randomUUID();
		
				BookingTraveler bookTraveler = (BookingTraveler) traveler;
				bookTraveler.setKey(uuid.toString());
//				System.out.println("Before Type Check, "  + bookTraveler.getTravelerType());
//				bookTraveler.setDOB(null);
				String typeIn = bookTraveler.getTravelerType();
				String typeStatic = "INF";
				
				if(typeIn.equals(typeStatic)) {
					bookTraveler.setDOB(getStingToXMLGregorianDate(traveler.getDateOfB()));
				}
				System.out.println("Age "+ traveler.getPassAge());
				if(traveler.getPassAge() != null) {
					bookTraveler.setAge(new BigInteger(traveler.getPassAge()));
				}
				
				System.out.println("DOB After GEN and Set : "+ bookTraveler.getDOB());
				
				airCreateReservationReq.getBookingTraveler().add(bookTraveler);

			}
		}

	}

	private XMLGregorianCalendar getStingToXMLGregorianDate(String dateOfB) {

		if (dateOfB != null) {
			try {
				System.out.println("DOB Param, "+ dateOfB);
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");//2021-11-26T09:05:00.000+06:00
//				dateOfB = dateOfB+"T00:00:00.000";
				Date date = dateFormat.parse(dateOfB);
//				GregorianCalendar calendar = new GregorianCalendar();
//				calendar.setTime(date);				
				return DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(date));
//				return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);

			}catch (DatatypeConfigurationException e) {
				System.out.println("String Parse DatatypeConfigurationException");
				e.printStackTrace();
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
		}

		return null;
	}

	/**
	 * Map billing point of sale.
	 *
	 * @return the billing point of sale info
	 */
	private BillingPointOfSaleInfo mapBillingPointOfSale() {
		BillingPointOfSaleInfo bpos = new BillingPointOfSaleInfo();
		bpos.setOriginApplication("UAPI");
		return bpos;
	}

	/**
	 * Map action status.
	 *
	 * @return the action status
	 */
	// No mapping for Trip Services
	private ActionStatus mapActionStatus() {
		ActionStatus actionStatus = new ActionStatus();
		actionStatus.setType("TAU");
		actionStatus.setProviderCode(core);
		actionStatus.setTicketDate("T*");

		return actionStatus;
	}

	/**
	 * @param travelers
	 * @return
	 */
	private List<SSR> mapSSR(List<Traveler> travelers) {

		List<SSR> ssrs = new ArrayList<SSR>();

		for (Traveler traveler : travelers) {
			SSR ssr = new SSR();

			ssr.setFreeText("////" + mapDOB(traveler.getDob()) + "/" + traveler.getGender().substring(0, 1) + "//"
					+ traveler.getPersonName().getSurname().toUpperCase() + "/"
					+ traveler.getPersonName().getGiven().toUpperCase());
			ssr.setKey("1");
			ssr.setType("DOCS");
			ssr.setStatus("HK");
			ssrs.add(ssr);
		}
		return ssrs;
	}

	/**
	 * @param month
	 * @return
	 */
	private String mapDOB(String dob) {
		LocalDate date = LocalDate.parse(dob);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyy", Locale.ENGLISH);
		return date.format(formatter).toString().toUpperCase();
	}

}
