package com.usoit.booking.models.request;

import com.travelport.schema.common_v50_0.BookingTraveler;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class BookingTravelerReq extends BookingTraveler {
	
	private String dateOfB;
	
	private String passAge;
	
	public String getDateOfB() {
		return dateOfB;
	}

	public void setDateOfB(String dateOfB) {
		this.dateOfB = dateOfB;
	}

	public String getPassAge() {
		return passAge;
	}

	public void setPassAge(String passAge) {
		this.passAge = passAge;
	}

	

}
