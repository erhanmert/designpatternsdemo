package mvc;

import mvc.controller.EmployeeController;
import mvc.model.Employee;
import mvc.view.EmployeeDashboardView;

public class Main {

    public static void main(String [] args){
        Employee erhan = retrieveEmployeeFromServer();
        EmployeeDashboardView view = new EmployeeDashboardView();

        EmployeeController controller = new EmployeeController(erhan,view);

        controller.updateDashboard();
    }

    public static Employee retrieveEmployeeFromServer(){
        Employee employee = new Employee();
        employee.setFirstName("erhan");
        employee.setLastName("mert");
        employee.setSsNumber("13515");
        employee.setSalary(123123);

        return employee;
    }
}
