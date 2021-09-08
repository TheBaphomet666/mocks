package com.example.mock.controller.model;

import java.io.Serializable;
import java.math.BigDecimal;


import lombok.Getter;

@Getter
public class Amount implements Serializable {

    private BigDecimal value;

    private String currency;
}
