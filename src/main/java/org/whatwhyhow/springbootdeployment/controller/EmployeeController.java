package org.whatwhyhow.springbootdeployment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.whatwhyhow.springbootdeployment.model.Employee;
import org.whatwhyhow.springbootdeployment.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

  private final EmployeeService employeeService;

  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer empId) {
    Employee employee = employeeService.getEmployee(empId);
    return ResponseEntity.ok(employee);
  }
}
