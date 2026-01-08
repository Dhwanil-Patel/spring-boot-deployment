package org.whatwhyhow.springbootdeployment.service;

import org.springframework.stereotype.Service;
import org.whatwhyhow.springbootdeployment.model.Employee;

import java.util.Map;

import static org.springframework.util.ObjectUtils.isEmpty;

@Service
public class EmployeeService {

  public Employee getEmployee(final Integer empId) {
    if (isEmpty(empId)) {
      throw new RuntimeException("Invalid input!!!");
    }
    return new Employee(1001, "Raj", Map.of("Mobile", 7572985024L), 3);
  }
}
