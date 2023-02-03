package com.firstSpringApp.SpringAppBasics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DetailsController {
@RequestMapping("/Details")
    public List<Details> getAllDetails(){
        return Arrays.asList(
                new Details("harish", 25, "Developer"),
                new Details("harish", 25, "UI Dev"),
                new Details("harish", 25, "UI Dev"),
                new Details("harish", 25, "UI Dev")
                );
    }
}
