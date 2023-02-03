package com.firstSpringApp.SpringAppBasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrenyConfigurationController {
    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;
@RequestMapping("/currency")
    public CurrencyServiceConfiguration getCurrency(){
        return currencyServiceConfiguration;
    }
}
