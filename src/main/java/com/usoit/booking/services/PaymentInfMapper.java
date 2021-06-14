package com.usoit.booking.services;

import com.travelport.schema.common_v50_0.FormOfPayment;
import com.usoit.booking.models.request.BookingPaymentInf;

public interface PaymentInfMapper {

	public FormOfPayment mappFormPayment(BookingPaymentInf bookingPaymentInf);

}
