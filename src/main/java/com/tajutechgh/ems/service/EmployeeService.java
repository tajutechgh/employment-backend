package com.tajutechgh.ems.service;

import com.tajutechgh.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long id);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(EmployeeDto employeeDto, Long id);

    EmployeeDto deleteEmployee(Long id);
}
