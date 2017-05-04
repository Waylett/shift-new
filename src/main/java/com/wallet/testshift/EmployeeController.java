package com.wallet.testshift;

/**
 * Created by Alex on 03/05/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(path="/api")
public class EmployeeController {


    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/employees/findByLastName/{lastName}", method=RequestMethod.GET)

    public List<Employee> findLastName(@PathVariable("lastName") String lastName){
        return employeeRepository.findBylastName(lastName);
    }

//    public List<Employee> findLastName(@PathVariable("lastName") String lastName){
//        return employeeRepository.findBylastName(lastName);
//    }
    //List<Employee> findBylastName(@Param("lastName") String lastName);









}
