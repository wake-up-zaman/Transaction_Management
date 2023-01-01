package com.example.Transaction.Management.controllers;


import com.example.Transaction.Management.payloads.StudentRegistrationAcknowledgement;
import com.example.Transaction.Management.payloads.StudentRegistrationRequest;
import com.example.Transaction.Management.service.StudentRegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1")

@EnableTransactionManagement
public class StudentRegistrationController {

    @Autowired
    private StudentRegistrationServiceImpl service;

    
    @RequestMapping(value={"/studentForm"},method=RequestMethod.POST)
    public StudentRegistrationAcknowledgement registerStudent(@RequestBody StudentRegistrationRequest request){
        return service.registerStudent(request);
    }

}
