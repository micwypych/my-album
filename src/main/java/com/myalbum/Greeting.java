package com.myalbum;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mwypych on 14.07.17.
 */
public class Greeting {

    public Greeting(String message) {
        this.message = message;
    }

    @JsonProperty(value = "gretting")
    private final String message;
}
