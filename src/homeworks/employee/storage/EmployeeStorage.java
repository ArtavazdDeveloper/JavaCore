package homeworks.employee.storage;

import homeworks.employee.model.Company;
import homeworks.employee.model.Employee;

public class EmployeeStorage {

    private  Employee[] employees = new Employee[100];

    private  int size = 0;
    public  void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }
    private  void extend() {

        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees,0,tmp,0,size);
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public  Employee searchID(String id) {
        for (int i = 0; i < size; i++){
            Employee employee = employees[i];
            if (employee.getEmplyeeID().contains(id)){
                return employee;
            }
        }
         return null;
     }
    public Employee searchEmployeeByCompany(Company companyName) {
        for (int i = 0; i < size; i++){
            Employee employee = employees[i];
            if (employee.getCompany().equals(companyName)){
                System.out.println(employee);
            }
        }
        return null;
    }
     public Employee searchEmployee(double salary1, double salary2) {
         for (int i = 0; i < size; i++) {
             if (employees[i].getSalary() >= salary2 && employees[i].getSalary() <= salary1 ){
                 System.out.println(employees[i]);
             }
         }
         return null;
     }
     public Employee companyNamechange(String Id, String company){
         for (int i = 0; i < size ; i++) {
             if (employees[i].getEmplyeeID().contains(Id)){
                 employees[i].setCompany();
                 System.out.println(employees[i]);
             }
         }
         return null;
     }
     public Employee activEmployee(String id, boolean activ1){
         for (int i = 0; i < size; i++) {
             if (employees[i].getEmplyeeID().contains(id)){
                 activ1 = false;
                 employees[i].setActive(activ1);
             }
         }
         return null;
     }
    public Employee activateEmployeeByid(String iD, boolean active2){
        for (int i = 0; i < size ; i++) {
            if (employees[i].getEmplyeeID().contains(iD)) {
                active2 = true;
                employees[i].setActive(active2);
            }
        }
        return null;
    }
    public void printByStatus(Boolean isActive) {
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive() == isActive){
                System.out.println(employees[i] + ",");
            }
        }
    }


}
