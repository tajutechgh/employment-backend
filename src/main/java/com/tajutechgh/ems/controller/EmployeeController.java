package com.tajutechgh.ems.controller;

import com.tajutechgh.ems.dto.EmployeeDto;
import com.tajutechgh.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping("/create")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {

       EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);

       return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id) {

        EmployeeDto employeeDto = employeeService.getEmployeeById(id);

        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {

        List<EmployeeDto> employees = employeeService.getAllEmployees();

        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDto employeeDto) {

        EmployeeDto updatedEmployee = employeeService.updateEmployee(employeeDto, id);

        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<EmployeeDto> deleteEmployee(@PathVariable Long id) {

        EmployeeDto deletedEmployee = employeeService.deleteEmployee(id);

        return new ResponseEntity<>(deletedEmployee, HttpStatus.OK);
    }
}
