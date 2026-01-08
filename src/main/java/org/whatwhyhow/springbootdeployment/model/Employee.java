package org.whatwhyhow.springbootdeployment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
  private Integer empId;
  private String name;
  private Map<String, Long> contactDetails;
  private Integer deptId;
}
