package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {

    private CurrencyServiceConfiguration currencyServiceConfiguration;

    @Autowired
    public CurrencyConfigurationController(CurrencyServiceConfiguration currencyServiceConfiguration){
        this.currencyServiceConfiguration = currencyServiceConfiguration;
    }

    @GetMapping("/currency-configuration")
    public CurrencyServiceConfiguration getCourses() {
        return currencyServiceConfiguration;
    }
}
