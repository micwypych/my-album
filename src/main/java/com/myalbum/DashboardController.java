package com.myalbum;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by mwypych on 14.07.17.
 */
@RestController
public class DashboardController {
    @GetMapping("/dashboard")
    public HttpEntity<Greeting> dashboard(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {

        Greeting greeting = new Greeting(String.format(greetingMessage, name));
        greeting.add(linkTo(methodOn(DashboardController.class).dashboard(name)).withSelfRel());
        return new ResponseEntity<Greeting>(greeting, HttpStatus.OK);
    }

    final String greetingMessage = "Hello, %s!";
}
