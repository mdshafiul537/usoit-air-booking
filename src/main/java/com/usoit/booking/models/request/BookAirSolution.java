package com.usoit.booking.models.request;

import java.util.ArrayList;
import java.util.List;

import com.travelport.schema.air_v50_0.TypeBaseAirSegment;
import com.travelport.schema.common_v50_0.HostToken;
import com.travelport.schema.common_v50_0.TypeTaxInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookAirSolution {

	private String key;

	private boolean completeItinerary;

	private String totalPrice;

	private String basePrice;

	private String approximateTotalPrice;

	private String approximateBasePrice;

	private String equivalentBasePrice;

	private String taxes;

	private String fees;

	private String approximateTaxes;

	private List<TypeBaseAirSegment> airSegment = new ArrayList<>();

	private List<HostToken> hostToken = new ArrayList<>();

	private List<BookPricings> bookingInfo = new ArrayList<>();
		

}
