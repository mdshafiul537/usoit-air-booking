package com.usoit.booking.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.travelport.schema.air_v50_0.AirPricingInfo;
import com.travelport.schema.air_v50_0.AirPricingSolution;
import com.travelport.schema.air_v50_0.BookingInfo;
import com.travelport.schema.air_v50_0.FareInfo;
import com.travelport.schema.air_v50_0.FlightDetails;
import com.travelport.schema.air_v50_0.PassengerType;
import com.travelport.schema.air_v50_0.TypeBaseAirSegment;
import com.travelport.schema.air_v50_0.TypeEticketability;
import com.travelport.schema.air_v50_0.TypePricingMethod;
import com.travelport.schema.common_v50_0.BookingTraveler;
import com.travelport.schema.common_v50_0.TypeTaxInfo;
import com.usoit.booking.models.request.BookAirSolution;
import com.usoit.booking.models.request.BookPricings;
import com.usoit.booking.models.request.BookingTravelerReq;
import com.usoit.booking.models.request.PassType;
import com.usoit.booking.services.PricingSolutionMapper;


@Service
public class PricingSolutionMapperImpl implements PricingSolutionMapper {

	@Override
	public AirPricingSolution mapBookSolutionToReqAirSolution(BookAirSolution solution, List<BookingTraveler> travelers) {

		System.out.println("Run mapBookSolutionToReqAirSolution !! ");

		AirPricingSolution airPricingSolution = new AirPricingSolution();
		
		if(solution.getAirSegment() != null) {
			
			List<TypeBaseAirSegment> segments = new ArrayList<>();
			for (TypeBaseAirSegment segment : solution.getAirSegment()) {
				List<FlightDetails> details = new ArrayList<>();
				if(segment.getFlightDetails() != null) {
					
					for (FlightDetails flightDetails : segment.getFlightDetails()) {
						flightDetails.setArrivalTime(null);
						flightDetails.setDepartureTime(null);
						details.add(flightDetails);
					}
				}
				segment.getFlightDetails().addAll(details);
			}
			
			airPricingSolution.getAirSegment().addAll(segments);	
		}
		
		

		airPricingSolution.getHostToken().addAll(solution.getHostToken());

		airPricingSolution.getAirPricingInfo().addAll(mappAirPriceInfo(solution.getBookingInfo(), travelers));

		airPricingSolution.setKey(solution.getKey());
		airPricingSolution.setCompleteItinerary(solution.isCompleteItinerary());
		airPricingSolution.setTotalPrice(solution.getTotalPrice());
		airPricingSolution.setBasePrice(solution.getBasePrice());
		airPricingSolution.setApproximateTotalPrice(solution.getApproximateTotalPrice());
		airPricingSolution.setApproximateBasePrice(solution.getApproximateBasePrice());
		airPricingSolution.setEquivalentBasePrice(solution.getEquivalentBasePrice());
		airPricingSolution.setTaxes(solution.getTaxes());
		airPricingSolution.setFees(solution.getFees());
		airPricingSolution.setApproximateTaxes(solution.getApproximateTaxes());

		System.out.println("mapBookSolutionToReqAirSolution Before Return !! ");

		return airPricingSolution;
	}

	private List<AirPricingInfo> mappAirPriceInfo(List<BookPricings> bookPricings, List<BookingTraveler> travelers) {

		List<AirPricingInfo> airPricingInfos = new ArrayList<>();

		System.out.println("mappAirPriceInfo Run !! ");

		if (bookPricings != null && travelers != null) {

			System.out.println("bookPricings Not Null and Size: " + bookPricings.size());
			

			for (BookPricings bookingPricing : bookPricings) {

				if (bookingPricing != null) {

					System.out.println("bookingPricing Not Null ");

					AirPricingInfo airPricingInfo = new AirPricingInfo();

					// Set Fare Infos Start
					setFareInfo(bookingPricing, airPricingInfo);
					// Set Fare Infos End

					// Set Booking Start
					setBookingInfo(bookingPricing, airPricingInfo);
					// Set Booking End

					// Tax info Set Start
					setTaxInfo(bookingPricing, airPricingInfo);
					// Tax info Set End

					// Passenger Type set Start
					setPassengerToFareInfo(bookingPricing, airPricingInfo, travelers);
					// Passenger Type set End

					if(bookingPricing.getPricingMethod() != null) {
						
						String pMetod = StringUtils.capitalize(bookingPricing.getPricingMethod());
						
						System.out.println("getPricingMethod: "+ pMetod);
						
						airPricingInfo.setPricingMethod(TypePricingMethod.valueOf(pMetod));
					}else {
						airPricingInfo.setPricingMethod(TypePricingMethod.AUTO);
					}
					
					
					airPricingInfo.setKey(bookingPricing.getKey());
					airPricingInfo.setFareCalc(bookingPricing.getFareCalc());
					airPricingInfo.setLatestTicketingTime(bookingPricing.getLatestTicketingTime());
					airPricingInfo.setProviderCode(bookingPricing.getProviderCode());
					airPricingInfo.setTotalPrice(bookingPricing.getTotalPrice());

					airPricingInfo.setBasePrice(bookingPricing.getBasePrice());
					airPricingInfo.setApproximateBasePrice(bookingPricing.getApproximateBasePrice());
					airPricingInfo.setApproximateTotalPrice(bookingPricing.getApproximateTotalPrice());
					airPricingInfo.setEquivalentBasePrice(bookingPricing.getEquivalentBasePrice());
					airPricingInfo.setTaxes(bookingPricing.getTaxes());
					airPricingInfo.setApproximateTaxes(bookingPricing.getApproximateTaxes());
					airPricingInfo.setApproximateFees(bookingPricing.getApproximateFees());

					if (bookingPricing.getServices() != null) {
						airPricingInfo.setServices(bookingPricing.getServices());
					}
					
					if(bookingPricing.getEticketability() != null) {
						
						airPricingInfo.setETicketability(TypeEticketability.valueOf(bookingPricing.getEticketability()));
					}
					

					System.out.println("Befor set airPricingInfo Run !! ");
					airPricingInfos.add(airPricingInfo);
				}

			}
		} else {
			System.out.println("bookPricings is Null ");
		}

		return airPricingInfos;
	}

	private void setPassengerToFareInfo(BookPricings bookingPricing, AirPricingInfo airPricingInfo, List<BookingTraveler> travelers) {

//		System.out.println("setPassengerToFareInfo Run !! ");

		if (bookingPricing.getPassengerType() != null) {
			
			
			List<String> insetKey = new ArrayList<>();
			
			for (PassType airPassType : bookingPricing.getPassengerType()) {
								
				String code = airPassType.getCode();
				
				PassengerType passengerType = new PassengerType();
				
				passengerType.setCode(airPassType.getCode());
				int btCount = 0; 
				for (BookingTraveler bookingTraveler : travelers) {
					
					String tCode = bookingTraveler.getTravelerType();
					String tKey = bookingTraveler.getKey();
					
//					System.out.println("insetKey.contains(travelerCode) Status, "+ insetKey.contains(tKey) + " Code Equals Status "+ code.equals(tCode));
//					
//					System.out.println("Code tCode & Key, insKeySize, "+ code +" , "+ tCode +" , " +tKey+ " , "+insetKey.size());
				
					if(code.equals(tCode) && !insetKey.contains(tKey) && passengerType.getBookingTravelerRef() == null) {

						passengerType.setBookingTravelerRef(tKey);
						passengerType.setCode(code);
						insetKey.add(tKey);
					}else {
//						System.out.println("Can't Pass Boot check, "+tCode + " Key: "+tKey);
					}
				}			
								
				airPricingInfo.getPassengerType().add(passengerType);
			}					
						
		}
	}

	private void setTaxInfo(BookPricings bookingPricing, AirPricingInfo airPricingInfo) {

		System.out.println("setTaxInfo Run !! ");

		if (bookingPricing.getTaxInfo() != null) {

			for (TypeTaxInfo typeTax : bookingPricing.getTaxInfo()) {

				airPricingInfo.getTaxInfo().add(typeTax);
			}

		}
	}

	private void setBookingInfo(BookPricings bookingPricing, AirPricingInfo airPricingInfo) {

		System.out.println("setBookingInfo Run !! ");

		if (bookingPricing.getBookingInfo() != null) {

			for (BookingInfo bkinf : bookingPricing.getBookingInfo()) {
				airPricingInfo.getBookingInfo().add(bkinf);
			}
		}
	}

	private void setFareInfo(BookPricings bookingPricing, AirPricingInfo airPricingInfo) {

		System.out.println("setFareInfo Run !! ");

		if (bookingPricing.getFareInfo() != null) {
			String passCode = "";
			
			if(bookingPricing.getPassengerType() != null) {
				
//				System.out.println("Air Price Inf Pass type List, "+bookingPricing.getPassengerType().size());
				for (PassType passType : bookingPricing.getPassengerType()) {
					System.out.println("PassType, To String "+ passType.toString());
					if(passType != null) {
						passCode = passType.getCode();
						System.out.println("Fare Inf Passenger Type, "+passCode);
					}
				}
				
			}

			
			for (FareInfo fareInf : bookingPricing.getFareInfo()) {
				fareInf.setDepartureDate(null);
				fareInf.setNotValidAfter(null);
				fareInf.setNotValidBefore(null);
				System.out.println("Befor Reset PTC, "+fareInf.getPassengerTypeCode());
				if(!passCode.isEmpty()) {
					fareInf.setPassengerTypeCode(passCode);
				}				
				System.out.println("After Reset PTC, "+fareInf.getPassengerTypeCode());
				airPricingInfo.getFareInfo().add(fareInf);
			}
		}
	}

}
