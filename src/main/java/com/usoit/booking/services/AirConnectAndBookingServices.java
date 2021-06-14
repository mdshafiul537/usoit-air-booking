package com.usoit.booking.services;

import com.travelport.schema.universal_v50_0.AirCreateReservationReq;
import com.travelport.schema.universal_v50_0.AirCreateReservationRsp;

public interface AirConnectAndBookingServices {

	public AirCreateReservationRsp addBooking(AirCreateReservationReq airCreateReservationReq, String actionDate);

	public AirCreateReservationReq getLocalRequest();
}
