package io.mostafa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.mostafa.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
io.mostafa.EmployeeService.Employee service;
@RequestMapping("/get")
public List<Employee> getEmplloyees(){
 return service.getEmployees();
}
}
