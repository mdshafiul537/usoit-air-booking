package com.usoit.booking.mapper.responseMapper;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travelport.schema.universal_v50_0.UniversalRecord;
import com.usoit.booking.models.OfferLink;
import com.usoit.booking.models.ParentOffer;
import com.usoit.booking.models.response.Reservation;
import com.usoit.booking.models.response.ReservationResponse;
import com.usoit.booking.models.response.Response;
import com.travelport.schema.universal_v50_0.AirCreateReservationRsp;

/**
 * The Class AirBookResponseMapper.
 */
@Component
public class AirBookResponseMapper {

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(AirBookResponseMapper.class);

	/** The response payment mapper. */
	@Autowired
	ResponsePaymentMapper responsePaymentMapper;

	/** The response offer mapper. */
	@Autowired
	ResponseOfferMapper responseOfferMapper;

	/** The response traveler mapper. */
	@Autowired
	ResponseTravelerMapper responseTravelerMapper;

	/**
	 * Instantiates a new air book response mapper.
	 */
	public AirBookResponseMapper() {

	}

	/**
	 * Return air book.
	 *
	 * @param airCreateReservationRsp the air create reservation rsp
	 * @return the response
	 */
	public Response returnAirBook(AirCreateReservationRsp airCreateReservationRsp) {
		LOG.debug("Entered returnAirBook");

		Response response = new Response();
		response.setReservationResponse(mapReservationResponse(airCreateReservationRsp));
		return response;
	}

	/**
	 * Map reservation response.
	 *
	 * @param airCreateReservationRsp the air create reservation rsp
	 * @return the reservation response
	 */
	private ReservationResponse mapReservationResponse(AirCreateReservationRsp airCreateReservationRsp) {
		LOG.debug("Entered mapReservationResponse");

		ReservationResponse reservationResponse = new ReservationResponse();
		reservationResponse.setReservation(mapReservation(airCreateReservationRsp));
		reservationResponse.setTransactionId(airCreateReservationRsp.getTransactionId());

		return reservationResponse;
	}

	/**
	 * Map reservation.
	 *
	 * @param airCreateReservationRsp the air create reservation rsp
	 * @return the reservation
	 */
	private Reservation mapReservation(AirCreateReservationRsp airCreateReservationRsp) {
		LOG.debug("Entered mapReservation");

		Reservation reservation = new Reservation();

		if (airCreateReservationRsp != null) {
			
			if(airCreateReservationRsp.getUniversalRecord() != null) {
				reservation.setTraveler(responseTravelerMapper
						.mapTravelers(airCreateReservationRsp.getUniversalRecord().getBookingTraveler()));
			}
			
			reservation.setOffer(responseOfferMapper.mapOffers(airCreateReservationRsp));
			
			if(airCreateReservationRsp.getUniversalRecord() != null) {
				reservation.setPayment(responsePaymentMapper.mapPayments(airCreateReservationRsp.getUniversalRecord()));
			}
			
			if(airCreateReservationRsp.getUniversalRecord() != null) {
				reservation.setOfferLink(mapOfferLink(airCreateReservationRsp.getUniversalRecord()));
			}

			
		}

		return reservation;
	}

	/**
	 * Map offer link.
	 *
	 * @param universalRecord the universal record
	 * @return the list
	 */
	private List<OfferLink> mapOfferLink(UniversalRecord universalRecord) {
		LOG.debug("Entered mapOffer");

		List<OfferLink> offerLinks = new ArrayList<OfferLink>();
		OfferLink offerLink = new OfferLink();
		offerLink.setType("OfferLink");
		offerLink.setOfferRef(universalRecord.getAirReservation().get(0).getLocatorCode());
		offerLink.setParentOffer(mapParentOffer(universalRecord));
		offerLinks.add(offerLink);

		return offerLinks;
	}

	/**
	 * Map parent offer.
	 *
	 * @param universalRecord the universal record
	 * @return the parent offer
	 */
	private ParentOffer mapParentOffer(UniversalRecord universalRecord) {
		LOG.debug("Entered mapParentOffer");

		ParentOffer parentOffer = new ParentOffer();
		parentOffer.setType("ParentOffer");
		parentOffer.setOfferRef(universalRecord.getLocatorCode());
		return parentOffer;
	}
}
