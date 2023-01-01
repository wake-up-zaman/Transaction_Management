package com.example.Transaction.Management.repositories;


import com.example.Transaction.Management.entity.StudentFormInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentFormInfoRepository extends JpaRepository<StudentFormInfo,Long> {
}