package com.example.day14cw1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14cw1.model.AmruthaEmployee;
import com.example.day14cw1.model.AmruthaPayroll;
import com.example.day14cw1.repository.AmruthaEmployeeRepo;
import com.example.day14cw1.repository.AmruthaPayrollRepo;

@Service
public class AmruthaPayrollService {

    @Autowired
    private AmruthaEmployeeRepo employeeRepo;

    @Autowired
    private AmruthaPayrollRepo payrollRepo;

    public AmruthaPayroll createPayroll(Long employeeId, AmruthaPayroll payroll) {
        AmruthaEmployee employee = employeeRepo.findById(employeeId).orElse(null);
        if (employee != null) {
            payroll.setEmployee(employee);
            return payrollRepo.save(payroll);
        }
        return null;
    }

    public AmruthaPayroll getPayrollByEmployeeId(Long employeeId) {
        AmruthaEmployee employee = employeeRepo.findById(employeeId).orElse(null);
        if (employee != null && employee.getPayroll() != null) {
            return employee.getPayroll();
        }
        return null;
    }
}
