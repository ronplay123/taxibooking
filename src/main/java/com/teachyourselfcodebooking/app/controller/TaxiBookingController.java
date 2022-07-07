package com.teachyourselfcodebooking.app.controller;

import com.teachyourselfcodebooking.app.Service.TaxiBookingService;
import com.teachyourselfcodebooking.app.entity.Taxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxiBookingController {

    @GetMapping("/taxibooking")
    public String taxibooking() {
    String str = "welcome for taxi booking";
    str = str.toLowerCase();
    str = str.toUpperCase();
    return str;

    }
    @Autowired
    TaxiBookingService taxiBookingService;

    @PostMapping(value="/createbooking")
    public Taxi createBooking(@RequestBody Taxi taxi) {
        return taxiBookingService.createBooking(taxi);

       }
    }

