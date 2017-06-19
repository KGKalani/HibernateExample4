package main.java.com.service;

import main.java.com.model.Employee;

import java.util.List;

/**
 * Created by Gayathri on 6/17/2017.
 */
public interface EmployeeService {
    public void saveEmployee(Employee employee);

    public List<Employee> fetchEmployeeList(Employee employee);
}
