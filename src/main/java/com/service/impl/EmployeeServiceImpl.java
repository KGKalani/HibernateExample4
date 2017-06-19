package main.java.com.service.impl;

import main.java.com.dao.EmployeeDao;
import main.java.com.model.Employee;
import main.java.com.service.EmployeeService;

import java.util.List;

/**
 * Created by Gayathri on 6/17/2017.
 */
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }

    @Override
    public List<Employee> fetchEmployeeList(Employee employee){
        return employeeDao.fetchEmployeeList(employee);
    }
}
