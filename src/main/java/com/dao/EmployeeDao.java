package main.java.com.dao;

import main.java.com.model.Employee;

import java.util.List;

/**
 * Created by Gayathri on 6/17/2017.
 */
public interface EmployeeDao {
    public void saveEmployee(Employee employee);

    public List<Employee> fetchEmployeeList(Employee employee);
}
