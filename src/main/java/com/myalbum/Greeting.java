package com.myalbum;
import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mwypych on 14.07.17.
 */
public class Greeting extends ResourceSupport {

    @JsonCreator
    public Greeting(@JsonProperty("greeting") String message) {
        this.message = message;
    }

    @JsonProperty(value = "greeting")
    private final String message;
}
