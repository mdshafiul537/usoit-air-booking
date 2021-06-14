package com.usoit.booking.controller;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.travelport.schema.air_v50_0.AirPricingSolution;
import com.travelport.schema.air_v50_0.AirPricingTicketingModifiers;
import com.travelport.schema.common_v50_0.BookingTraveler;
import com.travelport.schema.common_v50_0.BookingTravelerName;
import com.travelport.schema.common_v50_0.Email;
import com.travelport.schema.common_v50_0.PhoneNumber;
import com.travelport.schema.common_v50_0.TravelerInformation;
import com.travelport.schema.universal_v50_0.AirCreateReservationReq;
import com.travelport.schema.universal_v50_0.AirCreateReservationRsp;
import com.travelport.schema.universal_v50_0.TravelerCriteria;
import com.travelport.service.air_v50_0.AirFaultMessage;
import com.travelport.service.universal_v50_0.AvailabilityFaultMessage;
import com.usoit.booking.models.request.BookingRequest;
import com.usoit.booking.models.request.Request;
import com.usoit.booking.models.response.Response;
import com.usoit.booking.services.AirBookService;
import com.usoit.booking.services.AirConnectAndBookingServices;
import com.usoit.booking.services.BookingRequestMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * The Class AirBookController.
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Api(value = "AirCreateReservation Microservice")
public class AirBookController {

	/** The air book service. */
	@Autowired
	private AirBookService airBookService;
	
	@Autowired
	private AirConnectAndBookingServices airConnectAndBookingServices;
	
	@Autowired
	private BookingRequestMapper bookingRequestMapper;

	private AirCreateReservationReq localRequestDate;

	private AirCreateReservationReq requestItem;

	private AirCreateReservationReq customRequest;

	private AirCreateReservationRsp bResponse;


	/**
	 * @param uAPIAirBookService
	 */
	@Autowired
	AirBookController(AirBookService uAPIAirBookService) {
		this.airBookService = uAPIAirBookService;
	}

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(AirBookController.class);

	/**
	 * Index.
	 *
	 * @param request the request
	 * @return the response
	 * @throws AirFaultMessage          the air fault message
	 * @throws AvailabilityFaultMessage the availability fault message
	 */
	@ApiOperation(value = "Maps the model to a AirCreateReservationReq and executes a UAPI request", response = Response.class)
	@RequestMapping(value = "/reservations", method = RequestMethod.POST)
	public ResponseEntity<?> index(@Valid @RequestBody Request request) throws AirFaultMessage, AvailabilityFaultMessage {

		LOG.debug("Enter book controller, map to /reservations");
		Response response = null;
		response = airBookService.getAirBook(request);
		
		requestItem = airBookService.getRequestFormat();
		Map<String, Object> map = new HashMap<>();
		
		map.put("request", requestItem);
		
		map.put("response", response);
		return ResponseEntity.ok(map);
	}
	
	@RequestMapping(value = "/bookRequest", method = RequestMethod.GET)
	public ResponseEntity<?> getBookingObj() {
		
		System.out.println("Custom Booking Rquest !!");
		AirCreateReservationReq airCreateReservationReq = new AirCreateReservationReq();
		
		TravelerCriteria criteria = new TravelerCriteria();
		TravelerInformation information = new TravelerInformation();
		
		
		BookingTraveler bookingTraveler = new BookingTraveler();
		
		BookingTravelerName bookingTravelerName = new BookingTravelerName();
		bookingTravelerName.setPrefix("MD.");
		bookingTravelerName.setFirst("SHAFIUL");
		bookingTravelerName.setLast("ISLAM");
		
		PhoneNumber phoneNumber = new PhoneNumber();
		
		phoneNumber.setCountryCode("+880");
		phoneNumber.setNumber("1725686029");
		
		Email email = new Email();
		email.setEmailID("shafiul2014bd@gmail.com");
		
		
		bookingTraveler.setAge(new BigInteger("27"));
		bookingTraveler.getEmail().add(email);
		
		bookingTraveler.setBookingTravelerName(bookingTravelerName);
		bookingTraveler.getPhoneNumber().add(phoneNumber);
		bookingTraveler.setGender("M");

		bookingTraveler.setTravelerType("ADT");
		
		
//		bookingTraveler.setDOB();
		
		
		
		airCreateReservationReq.getBookingTraveler().add(bookingTraveler);
		airCreateReservationReq.getAirPricingSolution().add(new AirPricingSolution());
		airCreateReservationReq.getAirPricingTicketingModifiers().add(new AirPricingTicketingModifiers());
		
		return ResponseEntity.ok(airCreateReservationReq);
	}
	
	@RequestMapping(value = "/air-book", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> setBooking(@RequestBody AirCreateReservationReq airCreateReservationReq) {
		
		System.out.println("Air Custome Request Run !!");
		if(airCreateReservationReq != null) {
			
			AirCreateReservationRsp response = airConnectAndBookingServices.addBooking(airCreateReservationReq, "2021-01-27T23:59:00.000+06:00");
			
			if(response != null) {
				System.out.println("Response Not Null !!");
				return ResponseEntity.ok(response);
			}else {
				System.out.println("Response is Null !!");
				return ResponseEntity.ok(new String("Data Accept But Not Save !!"));
			}
			
		}
		
		return null;
	}
	
	@RequestMapping(value = "/get-xml", method = RequestMethod.GET)
	public ResponseEntity<?> getXmlResquestFormat() {
		
		System.out.println("Get XML Data Run !!");
		localRequestDate = airConnectAndBookingServices.getLocalRequest();
		
		if(localRequestDate != null) {
			if(localRequestDate.getAirPricingSolution() != null) {
				return ResponseEntity.ok(localRequestDate);
			}
		}
		return ResponseEntity.ok("XML Data Not Set");
	}
	
	@RequestMapping(value = "/get-xml-v2", method = RequestMethod.GET)
	public ResponseEntity<?> getXmlResquestFormatV2() {
		
		System.out.println("Get XML Data Run !!");
				
		if(requestItem != null) {
			if(requestItem.getAirPricingSolution() != null) {
				return ResponseEntity.ok(requestItem);
			}
		}
		return ResponseEntity.ok("XML Data Not Set");
	}
	
	
	@RequestMapping(value = "/cutom-book-request", method = RequestMethod.POST)
	public ResponseEntity<?> getCustomResquest(@RequestBody BookingRequest bookingRequest) {
		Map<String, Object> map = new HashMap<>();
		
		if(bookingRequest != null) {
			
			customRequest = bookingRequestMapper.mappReservationReq(bookingRequest);
			map.put("request", customRequest);
			AirCreateReservationRsp airBookResponse = airConnectAndBookingServices.addBooking(customRequest, bookingRequest.getActionDateTime());
			map.put("status", true);
			map.put("response", null);
			bResponse = airBookResponse;
			if(airBookResponse != null) {
				map.put("response", airBookResponse);
			}
			
			map.put("msg", new String("Accept Done !"));
			
			return ResponseEntity.ok(map);
		}
		
		map.put("status", false);
		map.put("response", null);
		map.put("msg", new String("Accept response failed !"));
		
		return ResponseEntity.ok(map);
	}
	
	@RequestMapping(value = "/get-xml-v3", method = RequestMethod.GET)
	public ResponseEntity<?> getXmlResquestFormatV3() {
		
		System.out.println("Get XML Data Run !!");
				
		if(customRequest != null) {
			
			return ResponseEntity.ok(customRequest);
			
		}
		return ResponseEntity.ok("XML Data Not Set V3 !!");
	}
	
	@RequestMapping(value = "/get-res", method = RequestMethod.GET)
	public ResponseEntity<?> getXmlResponse() {
		
		System.out.println("Get XML Data Run Response !!");
				
		if(bResponse != null) {
			
			return ResponseEntity.ok(bResponse);
			
		}
		return ResponseEntity.ok("XML Data Not Set V3 !!");
	}
	
	@RequestMapping(value = "/get-cust-request", method = RequestMethod.GET)
	public ResponseEntity<?> getCustomResquestFormat() {
		
		BookingRequest bookingRequest = new BookingRequest();
		
		return ResponseEntity.ok(bookingRequest);
	}
	
}
