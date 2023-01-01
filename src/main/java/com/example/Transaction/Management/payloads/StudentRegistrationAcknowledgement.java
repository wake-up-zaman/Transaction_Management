package com.example.Transaction.Management.payloads;

import com.example.Transaction.Management.entity.StudentFormInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRegistrationAcknowledgement {

    private String status;
    private double totalFare;
    private String pnrNo;
    private StudentFormInfo studentFormInfo;
}
