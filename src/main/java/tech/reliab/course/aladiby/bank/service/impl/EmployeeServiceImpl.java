package main.java.tech.reliab.course.aladiby.bank.service.impl;

import main.java.tech.reliab.course.aladiby.bank.entity.Employee;
import main.java.tech.reliab.course.aladiby.bank.service.EmployeeService;


public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public Employee createEmployee(Employee employee) {
        Employee newEmployee = new Employee(employee.getId(), employee.getFullName(), employee.getDateOfBirth(),
                employee.getJobPosition(), employee.getBank(), employee.getIsRemote(), employee.getOffice(),
                employee.getCanIssueCredit(), employee.getSalary());
        return newEmployee;
    }

}
