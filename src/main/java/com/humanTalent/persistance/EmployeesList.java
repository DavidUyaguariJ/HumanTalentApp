/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.humanTalent.persistance;

import com.humanTalent.logic.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Uyaguari
 */
public class EmployeesList {
    public static List<Employee> employees = new ArrayList<Employee>();
    
    public static Employee findEmployeeByDni(String ci) {
        for (Employee empleado : employees) {
            if (empleado.getDni().equals(ci)) {
                return empleado;
            }
        }
        return null;
    }
}
