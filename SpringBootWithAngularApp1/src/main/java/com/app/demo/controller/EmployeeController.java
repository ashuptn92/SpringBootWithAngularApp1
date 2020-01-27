package com.app.demo.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.demo.model.Employee;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/employees"})
public class EmployeeController {
	
	private List<Employee> employees = createList();

	@GetMapping(produces = "application/json")
	public List<Employee> firstPage() {
		return employees;
	}

	@DeleteMapping(path = { "/{id}" })
	public Employee delete(@PathVariable("id") int id) {
		Employee deletedEmp = null;
		for (Employee emp : employees) {
			if (emp.getEmpId() == id) {
				employees.remove(id);
				deletedEmp = emp;
				break;
			}
		}
		return deletedEmp;
	}

	@PostMapping
	public Employee create(@RequestBody Employee user) {
		employees.add(user);
		System.out.println(employees);
		return user;
	}
	
	private static List<Employee> createList() {
		List<Employee> tempEmployees = new ArrayList<>();
		Employee emp1 = new Employee();
		emp1.setEmpId(101);
		emp1.setEmpName("Ashutosh");
		emp1.setDesignation("Developer");
		emp1.setEmpSal(40000);
		emp1.setAdhaarNo(2123455667);
		emp1.setEmpEmail("ashuptn92@gmail.com");
		
		Employee emp2 = new Employee();
		emp2.setEmpId(102);
		emp2.setEmpName("Ghan Shyam");
		emp2.setDesignation("Master");
		emp2.setEmpSal(30000);
		emp2.setAdhaarNo(1238765667);
		emp2.setEmpEmail("shyam12@gmail.com");
		
		Employee emp3 = new Employee();
		emp3.setEmpId(103);
		emp3.setEmpName("Abhishek");
		emp3.setDesignation("Support Engineer");
		emp3.setEmpSal(18000);
		emp3.setAdhaarNo(2114656671);
		emp3.setEmpEmail("abhi65@gmail.com");
		
		tempEmployees.add(emp1);
		tempEmployees.add(emp2);
		tempEmployees.add(emp3);
		
		return tempEmployees;
	}
}
