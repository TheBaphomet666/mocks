package com.example.mock.controller;

import java.math.BigDecimal;
import java.util.UUID;

import com.example.mock.controller.model.AntifraudValidationRequest;
import com.example.mock.controller.model.FraudMaxResponse;
import com.example.mock.controller.model.SuperBankPaymentRequest;
import com.example.mock.controller.model.SuperBankPaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * RESTful Web Service Endpoint for payments.
 *
 * @author <a href="oscar.pinto@payulatam.com">Oscar Pinto</a>
 * @version 1.0.0
 * @since 	1.0.0
 */
@RestController
public class Controller {


    @Autowired
    public Controller() {

    }

    @PostMapping(path = "/fraudmax-api/validate")
    public ResponseEntity<FraudMaxResponse> purchaseOrder(@RequestBody final AntifraudValidationRequest validationRequest) {

        FraudMaxResponse response;
        if(validationRequest.getCard().getCardHolderName().equals("paco")){
            response = FraudMaxResponse.builder().risk(new BigDecimal("10")).analyzer("me").isCovered(false).build();
        }
        else{
            response = FraudMaxResponse.builder().risk(new BigDecimal("100")).analyzer("me").isCovered(false).build();
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(path = "/superbank-api/pay")
    public ResponseEntity<SuperBankPaymentResponse> purchaseOrder(@RequestBody final SuperBankPaymentRequest purchaseRequest) {

        SuperBankPaymentResponse response;
        if(purchaseRequest.getInstallments() == 32){
            response = SuperBankPaymentResponse.builder()
                    .paymentId(UUID.randomUUID().toString()).responseMessage("APPROVED").state("approved").build();
        }
        else{
            response = SuperBankPaymentResponse.builder()
                    .paymentId(UUID.randomUUID().toString()).responseMessage("DECLINED").state("declined").build();
        }


        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
