package com.usoit.booking.services;

import java.util.List;

import com.travelport.schema.air_v50_0.AirPricingSolution;
import com.travelport.schema.common_v50_0.BookingTraveler;
import com.usoit.booking.models.request.BookAirSolution;
import com.usoit.booking.models.request.BookingTravelerReq;

public interface PricingSolutionMapper {

	public AirPricingSolution mapBookSolutionToReqAirSolution(BookAirSolution solution, List<BookingTraveler> travelers);

}
