package com.usoit.booking.mapper.responseMapper;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travelport.schema.air_v50_0.AirReservation;
import com.travelport.schema.common_v50_0.FormOfPayment;
import com.travelport.schema.universal_v50_0.AirCreateReservationRsp;
import com.travelport.schema.universal_v50_0.UniversalRecord;
import com.usoit.booking.models.Identifier;
import com.usoit.booking.models.Offer;
import com.usoit.booking.models.Product;

/**
 * The Class ResponseOfferMapper.
 */
@Component
public class ResponseOfferMapper {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(ResponseOfferMapper.class);

  /** The response price mapper. */
  @Autowired
  ResponsePriceMapper responsePriceMapper;

  /** The response passenger flight mapper. */
  @Autowired
  ResponsePassengerFlightMapper responsePassengerFlightMapper;

  /** The response flight segment mapper. */
  @Autowired
  ResponseFlightSegmentMapper responseFlightSegmentMapper;

  @Autowired
  ResponseCreditCardAuthorizationMapper responseCreditCardAuthorizationMapper;

  /**
   * Map offers.
   *
   * @param airCreateReservationRsp the air create reservation rsp
   * @return the list
   */
  public List<Offer> mapOffers(AirCreateReservationRsp airCreateReservationRsp) {
    LOG.debug("Entered mapOffers");

    UniversalRecord universalRecord = airCreateReservationRsp.getUniversalRecord();
    
    List<Offer> offers = new ArrayList<Offer>();
    
    if(universalRecord != null) {
    	
    	List<AirReservation> airReservation = universalRecord.getAirReservation();
    	List<FormOfPayment> formOfPayments = universalRecord.getFormOfPayment();
    	
    	

        for (int i = 0; i < airReservation.size(); i++) {
          Offer offer = new Offer();
          offer.setProduct(mapProducts(airReservation));
          offer.setPrice(responsePriceMapper.mapPrice(airReservation.get(i).getAirPricingInfo()));
          offer.setIdentifier(mapIdentifier(airCreateReservationRsp));
          offer.setPaymentCardAuthorizationSummary(responseCreditCardAuthorizationMapper
              .mapPaymentCardAuthorizationSummary(formOfPayments.get(i)));
          offers.add(offer);
        }
    }
    
    
    
    
    return offers;
  }

  /**
   * Map products.
   *
   * @param airReservations the air reservations
   * @return the list
   */
  private List<Product> mapProducts(List<AirReservation> airReservations) {
    LOG.debug("Entered mapProducts");

    List<Product> products = new ArrayList<Product>();

    for (int i = 0; i < airReservations.size(); i++) {
      Product product = new Product();
      product.setFlightSegment(
          responseFlightSegmentMapper.mapFlightSegments(airReservations.get(i).getAirSegment()));
      product.setPassengerFlight(responsePassengerFlightMapper
          .mapPassengerFlights(airReservations.get(i).getAirPricingInfo()));
      products.add(product);
    }
    return products;
  }

  /**
   * Map identifier.
   *
   * @param airCreateReservationRsp the air create reservation rsp
   * @return the identifier
   */
  private Identifier mapIdentifier(AirCreateReservationRsp airCreateReservationRsp) {
    LOG.debug("Entered mapIdentifier");

    Identifier identifier = new Identifier();
    identifier.setValue(airCreateReservationRsp.getTransactionId());
    return identifier;
  }
}
