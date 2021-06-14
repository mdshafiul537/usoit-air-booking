package com.usoit.booking.models.request;

import java.util.ArrayList;
import java.util.List;

import com.travelport.schema.air_v50_0.BookingInfo;
import com.travelport.schema.air_v50_0.FareInfo;
import com.travelport.schema.common_v50_0.TypeTaxInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookPricings {
	
	private List<FareInfo> fareInfo = new ArrayList<>();
	
	private List<BookingInfo> bookingInfo;
	
	private List<TypeTaxInfo> taxInfo;
	
	private String fareCalc;
	
	private List<PassType> passengerType;
	
    private String key;
    
	private String latestTicketingTime;
	
	private String pricingMethod;
	
	private String providerCode;
	
	private String totalPrice;
	
	private String basePrice;
	
	private String approximateTotalPrice;
	
	private String approximateBasePrice;
	
	private String equivalentBasePrice;
	
	private String taxes;
	
	private String fees;
	
	private String services;
	
	private String approximateTaxes;
	
	private String approximateFees;
	
	private String eticketability;

}
