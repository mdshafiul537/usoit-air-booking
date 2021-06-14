package com.usoit.booking.models.request;

import java.util.ArrayList;
import java.util.List;

import com.travelport.schema.air_v50_0.AirPricingInfo;
import com.travelport.schema.air_v50_0.AirSegmentList;
import com.travelport.schema.air_v50_0.TypeBaseAirSegment;
import com.travelport.schema.common_v50_0.BookingTraveler;
import com.travelport.schema.common_v50_0.HostToken;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequest {
	
	private String traceId;
	
	private String actionDateTime;
	
	private List<BookingTravelerReq> bookingTravelerReq = new ArrayList<>();
	
	private List<BookAirSolution> bookAirSolution;
	
	private BookingPaymentInf bookingPaymentInf;
	
	
	
}
