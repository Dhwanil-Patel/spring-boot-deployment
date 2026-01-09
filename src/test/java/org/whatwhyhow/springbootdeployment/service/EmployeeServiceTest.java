package org.whatwhyhow.springbootdeployment.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.whatwhyhow.springbootdeployment.model.Employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

  @InjectMocks
  private EmployeeService employeeService;

  @Test
  public void testSuccessResponse() {
    Employee employee = employeeService.getEmployee(1);
    assertEquals(1001, employee.getEmpId());
    assertEquals(7572985024L, employee.getContactDetails().get("Mobile"));
    assertEquals(3, employee.getDeptId());
  }
}
