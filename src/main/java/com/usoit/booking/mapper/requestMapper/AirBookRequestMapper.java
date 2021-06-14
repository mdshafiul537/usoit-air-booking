package com.usoit.booking.mapper.requestMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import com.travelport.schema.common_v50_0.ActionStatus;
import com.travelport.schema.common_v50_0.BillingPointOfSaleInfo;
import com.travelport.schema.universal_v50_0.AirCreateReservationReq;
import com.usoit.booking.models.request.Request;
import com.usoit.booking.models.request.ReservationSummary;

/**
 * The Class AirBookRequestMapper.
 */
@Component
@EnableConfigurationProperties
@ConfigurationProperties("air")

public class AirBookRequestMapper {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(AirBookRequestMapper.class);

  /** The branch. */
  @Value("${air.branch}")
  private String branch;

  /** The core. */
  @Value("${air.core}")
  private String core;

  /** The product mapper. */
  @Autowired
  ProductMapper productMapper;

  /** The traveler mapper. */
  @Autowired
  TravelerMapper travelerMapper;

  /** The payment mapper. */
  @Autowired
  PaymentMapper paymentMapper;

  /**
   * Instantiates a new air book request mapper.
   */
  public AirBookRequestMapper() {

  }

  /**
   * Gets the air book.
   *
   * @param request the request
   * @return the air book
   */
  public AirCreateReservationReq getAirBook(Request request) {
    LOG.debug("Entered getAirBook");

    ReservationSummary reservationSummary = request.getReservationSummary();
    AirCreateReservationReq airCreateReservationRequest = new AirCreateReservationReq();

    airCreateReservationRequest.setTargetBranch(branch);
    
    airCreateReservationRequest.setBillingPointOfSaleInfo(mapBillingPointOfSale());
    
    airCreateReservationRequest.getBookingTraveler()
        .add(travelerMapper.mapBookingTraveler(reservationSummary.getTraveler()));
    
    airCreateReservationRequest.getAirPricingSolution()
        .add(productMapper.mapAirPricingSolution(reservationSummary));
    
    airCreateReservationRequest.getActionStatus().add(mapActionStatus());
    airCreateReservationRequest.getFormOfPayment()
        .add(paymentMapper.mapPayment(reservationSummary));

    return airCreateReservationRequest;
  }

  /**
   * Map billing point of sale.
   *
   * @return the billing point of sale info
   */
  private BillingPointOfSaleInfo mapBillingPointOfSale() {
    LOG.debug("Entered mapBillingPointOfSale");
    BillingPointOfSaleInfo bpos = new BillingPointOfSaleInfo();
    bpos.setOriginApplication("UAPI");
    return bpos;
  }

  /**
   * Map action status.
   *
   * @return the action status
   */
  // No mapping for Trip Services
  private ActionStatus mapActionStatus() {
    LOG.debug("Entered mapActionStatus");
    ActionStatus actionStatus = new ActionStatus();
    actionStatus.setType("ACTIVE");
    actionStatus.setProviderCode(core);
    actionStatus.setTicketDate("T*");

    return actionStatus;
  }
}
