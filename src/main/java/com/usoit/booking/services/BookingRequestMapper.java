package com.usoit.booking.services;

import com.travelport.schema.universal_v50_0.AirCreateReservationReq;
import com.usoit.booking.models.request.BookingRequest;

public interface BookingRequestMapper {
	
	public AirCreateReservationReq mappReservationReq(BookingRequest bookingRequest);

}
