package com.bluesoft.controller;

import com.bluesoft.entity.Employee;
import com.bluesoft.entity.Enterprise;
import com.bluesoft.entity.Profile;
import com.bluesoft.entity.Transaction;
import com.bluesoft.enums.Enum_RolName;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class Rest {

    @GetMapping("/profile")
    public String generarProfile(){
        Profile miProfile = new Profile("01", "image.jpg", "3188701332", new Employee(), new Date(), new Date());
        return miProfile.toString();
    }

    @GetMapping("/employee")
    public String generarEmployee(){
        Employee miEmployee = new Employee(789L, "fjavier2411@gmail.com", new Profile(), Enum_RolName.Admin, new Enterprise(), new ArrayList<Transaction>(), new Date(), new Date());
        return miEmployee.toString();
    }

    @GetMapping("/transaction")
    public String generarTransaction(){
        Transaction miTransaction = new Transaction(456L, "Pago de nomina", 5000000, new Employee(), new Enterprise(), new Date(), new Date());
        return miTransaction.toString();
    }

    @GetMapping("/enterprise")
    public String generarEnterprise(){
        Enterprise miEmpresa = new Enterprise(123L, "BlueSoft", "01500123", "3188701332", "Calle 123", new ArrayList<Employee>(), new ArrayList<Transaction>(), new Date(), new Date());
        return miEmpresa.toString();
    }

}