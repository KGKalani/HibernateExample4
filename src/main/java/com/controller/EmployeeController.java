package main.java.com.controller;

import main.java.com.model.Address;
import main.java.com.model.Employee;
import main.java.com.service.AddressService;
import main.java.com.service.EmployeeService;
import main.java.com.service.impl.AddressServiceImpl;
import main.java.com.service.impl.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Gayathri on 6/17/2017.
 */
public class EmployeeController {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        EmployeeService employeeService = (EmployeeServiceImpl)context.getBean("empService");
        AddressService addressService = (AddressServiceImpl)context.getBean("addressService");

        /*
        Address data
         */
        String streetName = "Melbern";
        String cityName = "Nugegoda";
        String stateName = "Colombo";
        String zipCode = "10100";

        Address address = new Address(streetName, cityName, stateName, zipCode);

        addressService.saveAddress(address);

        /*
        Employee Data
         */
        String firstName = "Jhon";
        String lastName = "Peter";
        float salary = 25000f;

        Employee employee = new Employee(firstName, lastName,
                salary,address);

        employeeService.saveEmployee(employee);

        employee.setId(1);
        List<Employee> employeeList = employeeService.fetchEmployeeList(employee);

        for(Employee emp : employeeList){
            System.out.println("ID : "+emp.getId());
            System.out.println("First Name : "+emp.getFirstName());
            System.out.println("Last Name : "+emp.getLastName());
            System.out.println("Job : " +emp.getJob());
            System.out.println("Salary : "+emp.getSalary());
//            System.out.println("Job : "+emp.getJob());
            System.out.println();
        }
    }
}
