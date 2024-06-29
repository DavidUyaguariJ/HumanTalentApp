/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.humanTalent.persistance;

import com.humanTalent.logic.WorkArea;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Uyaguari
 */
public class WorkAreasList {
    public static List<WorkArea> workAreas = new ArrayList<WorkArea>();
   
   
   public static WorkArea findWorkAreaByName(List<WorkArea> workAreas, String name) {
        for (WorkArea area : workAreas) {
            if (area.getWorkArea().equalsIgnoreCase(name)) {
                return area;
            }
        }
        return null; 
    }
}
