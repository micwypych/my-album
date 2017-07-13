package com.myalbum;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mwypych on 14.07.17.
 */
@RestController
public class DashboardController {
    @RequestMapping("/dashboard")
    public Greeting dashboard(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(String.format(greetingMessage, name));
    }

    final String greetingMessage = "Hello, %s!";
}
