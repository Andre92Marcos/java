package com.andre.isidoro.thymeleafspringbootcrud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.isidoro.thymeleafspringbootcrud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code!
	// add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();
}
