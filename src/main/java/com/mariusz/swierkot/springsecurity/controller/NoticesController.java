package com.mariusz.swierkot.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
    @GetMapping("/getNotice")
    public String seyWelcome() {
        return "Notice controller details from the DB";
    }
}
