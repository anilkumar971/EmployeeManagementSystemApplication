package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.entity.ContactUs;
import com.example.EmployeeManagementSystem.repo.ContactUsRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactUsServiceImpl implements  ContactUsService{

    private final ContactUsRepository contactUsRepository;

    public ContactUsServiceImpl(ContactUsRepository contactUsRepository) {
        this.contactUsRepository = contactUsRepository;
    }

    @Override
    public ContactUs saveMessage(ContactUs contactUs) {
        return contactUsRepository.save(contactUs);
    }
}
