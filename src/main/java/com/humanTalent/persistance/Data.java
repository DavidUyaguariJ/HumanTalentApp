
package com.humanTalent.persistance;

import com.humanTalent.logic.Employee;
import com.humanTalent.logic.WorkArea;
import java.util.List;
import java.util.ArrayList;

public class Data {
   public static List<WorkArea> workAreas = new ArrayList<WorkArea>();
   public static List<Employee> employees = new ArrayList<Employee>();
   
   public static WorkArea findWorkAreaByName(List<WorkArea> workAreas, String name) {
        for (WorkArea area : workAreas) {
            if (area.getWorkArea().equalsIgnoreCase(name)) {
                return area;
            }
        }
        return null; 
    }
}
