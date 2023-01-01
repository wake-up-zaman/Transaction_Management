package com.example.Transaction.Management.service;

import com.example.Transaction.Management.entity.PaymentInfo;
import com.example.Transaction.Management.entity.StudentFormInfo;
import com.example.Transaction.Management.payloads.StudentRegistrationAcknowledgement;
import com.example.Transaction.Management.payloads.StudentRegistrationRequest;
import com.example.Transaction.Management.repositories.PaymentInfoRepository;
import com.example.Transaction.Management.repositories.StudentFormInfoRepository;
import com.example.Transaction.Management.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class StudentRegistrationServiceImpl {

    @Autowired
    private StudentFormInfoRepository studentFormInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional
    public StudentRegistrationAcknowledgement registerStudent(StudentRegistrationRequest request) {

        StudentFormInfo studentFormInfo = request.getStudentFormInfo();
        studentFormInfo = studentFormInfoRepository.save(studentFormInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), studentFormInfo.getFare());

        paymentInfo.setPassengerId(studentFormInfo.getId());
        paymentInfo.setAmount(studentFormInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new StudentRegistrationAcknowledgement("SUCCESS", studentFormInfo.getFare(), UUID.randomUUID().toString().split("-")[0], studentFormInfo);

    }
}

