package com.wallet.testshift;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        //this.repository.save(new Employee("Frodo", "Baggins", "Manager","Monday","Morning"));
        //this.repository.save(new Employee("John", "Smith", "Cleaner","Monday","Afternoon"));
        //this.repository.save(new Employee("John", "Wayne", "Is that you? Is this me","Saturday","Morning"));
        //this.repository.save(new Employee("Jane", "Doe", "Supervisor","Tuesday","Morning"));
    }
}