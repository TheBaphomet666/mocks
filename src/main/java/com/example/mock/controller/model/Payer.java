package com.example.mock.controller.model;

import java.io.Serializable;

import lombok.Getter;

@Getter
public class Payer implements Serializable {

    private String name;

    private String address;

    private String email;

    private String number;
}
