package com.example.Transaction.Management.payloads;


import com.example.Transaction.Management.entity.PaymentInfo;
import com.example.Transaction.Management.entity.StudentFormInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRegistrationRequest {

        private StudentFormInfo studentFormInfo;
        private PaymentInfo paymentInfo;

}
