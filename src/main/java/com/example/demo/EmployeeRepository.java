package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

    public interface EmployeeRepository extends MongoRepository<Employee, String> {

        public Employee findByName(String name);
        public List<Employee> findAll();

    }

