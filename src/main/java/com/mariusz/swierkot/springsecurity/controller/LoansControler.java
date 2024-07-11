package com.mariusz.swierkot.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansControler {

    @GetMapping("/myLoans")
    public String getLoansDetails() {
        return "Loans controller details from the DB";
    }
}
