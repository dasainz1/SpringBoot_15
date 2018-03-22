package com.sainz3.demo;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository
            extends CrudRepository <Employee, Long> {
}
