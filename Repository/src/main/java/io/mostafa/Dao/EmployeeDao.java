package io.mostafa.Dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import io.mostafa.model.Employee;

@Repository
public class EmployeeDao {

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return Arrays.asList(new Employee(1,"mostafa"),new Employee(2,"mahmoud"));
	}
	

}
