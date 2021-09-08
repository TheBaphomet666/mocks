package com.example.mock.controller.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class FraudMaxResponse implements Serializable {

    private BigDecimal risk;

    private String analyzer;

    private boolean isCovered;

}
