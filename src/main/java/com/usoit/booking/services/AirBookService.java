package com.usoit.booking.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelport.schema.universal_v50_0.AirCreateReservationReq;
import com.travelport.schema.universal_v50_0.AirCreateReservationRsp;
import com.travelport.service.air_v50_0.AirFaultMessage;
import com.usoit.booking.connector.AirBookConnector;
import com.usoit.booking.mapper.requestMapper.AirBookRequestMapper;
import com.usoit.booking.mapper.responseMapper.AirBookResponseMapper;
import com.usoit.booking.models.request.Request;
import com.usoit.booking.models.response.Response;

/**
 * The Class AirBookService.
 */
@Service
public class AirBookService {

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(AirBookService.class);

	/** The air book request mapper. */
	@Autowired
	AirBookRequestMapper airBookRequestMapper;

	/** The air book response mapper. */
	@Autowired
	AirBookResponseMapper airBookResponseMapper;

	/** The air book connector. */
	@Autowired
	AirBookConnector airBookConnector;

	private AirCreateReservationReq localRequestBeforSend;

	/**
	 * @param request
	 * @return
	 * @throws AirFaultMessage
	 */
	public Response getAirBook(Request request) throws AirFaultMessage {
		LOG.debug("Model sent to mapper to get a response");
		
		AirCreateReservationReq airCreateReservationReq = airBookRequestMapper.getAirBook(request);
		Response response = new Response();

		localRequestBeforSend = airCreateReservationReq;
		AirCreateReservationRsp airCreateReservationRsp = airBookConnector.callAirBook(airCreateReservationReq);
		response = airBookResponseMapper.returnAirBook(airCreateReservationRsp);

		return response;
	}

	public AirCreateReservationReq getRequestFormat() {
		return localRequestBeforSend;

	}
}
