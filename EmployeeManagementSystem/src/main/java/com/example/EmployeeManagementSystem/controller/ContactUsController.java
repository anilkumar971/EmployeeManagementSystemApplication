package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.entity.ContactUs;
import com.example.EmployeeManagementSystem.service.ContactUsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact-us")
public class ContactUsController {

    private final ContactUsService contactUsService;

    public ContactUsController(ContactUsService contactUsService) {
        this.contactUsService = contactUsService;
    }

    @PostMapping
    public ContactUs saveContactMessage(@RequestBody ContactUs contactUs) {
        return contactUsService.saveMessage(contactUs);
    }
}
