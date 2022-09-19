package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired

	private EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Employee("2345","Smith","45"));
		repository.save(new Employee("5678","John","45"));
		repository.save(new Employee("7896","akila","34"));

		// fetch all customers
		System.out.println("Employees found with findAll():");
		System.out.println("-------------------------------");
		for (Employee employee : repository.findAll()) {
			System.out.println(employee);
		}
		System.out.println();

		// fetch an individual employee
		System.out.println("employee found with findname('Smith'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByName("Smith"));

		System.out.println("Customers found with findAll():");
		System.out.println("--------------------------------");
		for (Employee employee : repository.findAll()) {
			System.out.println(employee);
		}

	}
}
