package io.mostafa.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.mostafa.Dao.EmployeeDao;

@Service
public class Employee {
@Autowired
EmployeeDao dao;
	public List<io.mostafa.model.Employee> getEmployees() {
		// TODO Auto-generated method stub
		return dao.getEmployees();
	}

}
