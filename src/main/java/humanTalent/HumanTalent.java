
package humanTalent;

import com.humanTalent.gui.Login;
import com.humanTalent.logic.Employee;
import com.humanTalent.logic.WorkArea;
import com.humanTalent.persistance.EmployeesList;
import com.humanTalent.persistance.WorkAreasList;
public class HumanTalent {
    public static void main(String [] args){
         //private String name;
    //private String lastName;
    //private String dni;
    //private String phoneNumber;
    //private WorkArea workArea;
    //private boolean status;
    //private double salary;

        WorkAreasList.workAreas.add(new WorkArea("RRHH"));
        WorkAreasList.workAreas.add(new WorkArea("OPERATIVO"));
        WorkArea wa= WorkAreasList.findWorkAreaByName(WorkAreasList.workAreas, "RRHH");
        EmployeesList.employees.add(new Employee("David","Uyaguari", "1856632547","0995632524",wa, true, 600.4 ));
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
    }
}
