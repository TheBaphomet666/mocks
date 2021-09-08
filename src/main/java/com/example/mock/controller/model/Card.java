package com.example.mock.controller.model;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Card implements Serializable {

    private String number;

    private String expirationDate;

    private String cvv;

    private String cardHolderName;

}
