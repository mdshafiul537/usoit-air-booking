package com.usoit.booking.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.travelport.schema.common_v50_0.ActionStatus;
import com.travelport.schema.common_v50_0.BillingPointOfSaleInfo;
import com.travelport.schema.common_v50_0.BookingTraveler;
import com.travelport.schema.universal_v50_0.AirCreateReservationReq;
import com.travelport.schema.universal_v50_0.AirCreateReservationRsp;
import com.usoit.booking.connector.AirBookConnector;
import com.usoit.booking.services.AirConnectAndBookingServices;

@EnableConfigurationProperties
@ConfigurationProperties("air")
@Service
public class AirConnectAndBookingServicesImpl implements AirConnectAndBookingServices {

	@Autowired
	private AirBookConnector airBookConnector;

	/** The branch. */
	@Value("${air.branch}")
	private String branch;

	/** The core. */
	@Value("${air.core}")
	private String core;

	private AirCreateReservationReq localStore;

	@Override
	public AirCreateReservationRsp addBooking(AirCreateReservationReq airCreateReservationReq, String actionDate) {
		

		airCreateReservationReq.setTargetBranch(branch);

		airCreateReservationReq.setBillingPointOfSaleInfo(mapBillingPointOfSale());

		airCreateReservationReq.getActionStatus().addAll(mapActionStatus(actionDate, airCreateReservationReq.getBookingTraveler().size()));
		
		localStore = airCreateReservationReq;

		AirCreateReservationRsp resonse = airBookConnector.callAirBook(airCreateReservationReq);
		
		
		return resonse;
	}
	
	@Override
	public AirCreateReservationReq getLocalRequest() {
		
		return localStore;
	}
	
	private List<ActionStatus> mapActionStatus(String actionDate, int qty) {
		
		List<ActionStatus> actionStatus = new ArrayList<>();
		
		System.out.println("Passenger Qty: "+qty);
		
		for (int i = 0; i < 1; i++) {
			System.out.println("Count Loop: "+i);
			ActionStatus actionSts = new ActionStatus();
			actionSts.setType("TAW");
			actionSts.setProviderCode(core);
			//actionSts.setTicketDate("T*");
			//actionSts.setTicketDate("T23:59:00.000");
			actionSts.setTicketDate(actionDate);
			actionSts.setSupplierCode(core);
			
			actionStatus.add(actionSts);
		}
		
		return actionStatus;
	}

	private BillingPointOfSaleInfo mapBillingPointOfSale() {

		BillingPointOfSaleInfo bpos = new BillingPointOfSaleInfo();
		bpos.setOriginApplication("UAPI");
		return bpos;

	}

}
