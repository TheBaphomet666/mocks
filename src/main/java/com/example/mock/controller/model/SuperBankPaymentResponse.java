package com.example.mock.controller.model;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SuperBankPaymentResponse implements Serializable {

    private String paymentId;

    private String state;

    private String responseMessage;

}
