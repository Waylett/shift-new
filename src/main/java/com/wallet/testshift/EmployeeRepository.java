package com.wallet.testshift;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
    List<Employee> findBylastName(@Param("lastName") String lastName);


        Employee findOne(Long id);
}
