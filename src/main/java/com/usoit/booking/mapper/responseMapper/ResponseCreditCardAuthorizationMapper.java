package com.usoit.booking.mapper.responseMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.travelport.schema.common_v50_0.FormOfPayment;
import com.usoit.booking.models.response.PaymentCardAuthorizationSummary;

/**
 * The Class ResponseCreditCardAuthorizationMapper.
 */
@Component
public class ResponseCreditCardAuthorizationMapper {
  
  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(ResponseCreditCardAuthorizationMapper.class);

  /**
   * Map payment card authorization summary.
   *
   * @param formOfPayment the form of payment
   * @return the payment card authorization summary
   */
  public PaymentCardAuthorizationSummary mapPaymentCardAuthorizationSummary(
      FormOfPayment formOfPayment) {
    LOG.debug("Entered mapPaymentCardAuthorizationSummary");

    PaymentCardAuthorizationSummary paymentCardAuthorizationSummary =
        new PaymentCardAuthorizationSummary();

    paymentCardAuthorizationSummary.setPaymentCardAuthorizationRef(formOfPayment.getKey());
    paymentCardAuthorizationSummary.setCompletionCode(formOfPayment.getProfileKey());

    return paymentCardAuthorizationSummary;
  }
}
