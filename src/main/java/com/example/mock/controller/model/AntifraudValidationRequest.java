package com.example.mock.controller.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AntifraudValidationRequest implements Serializable {

    private Payer payer;

    private Card card;

    private Amount amount;
}
