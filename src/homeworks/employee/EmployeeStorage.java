package homeworks.employee;

public class EmployeeStorage {

    private  Employee [] employees = new Employee[100];

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
    public Employee searchCompany(String companyName) {
        for (int i = 0; i < size; i++){
            Employee employee = employees[i];
            if (employee.getCompany().contains(companyName)){
                System.out.println(employee);
            }
        }
        return null;
    }
     public Employee searchEmployee(double salary1, double salary2) {
         for (int i = 0; i < size; i++) {
             if (employees[i].getSalary() <= salary1 || employees[i].getSalary() >= salary2){
                 System.out.println(employees[i] + " , ");
             }
         }
         return null;
     }
     public Employee companyNamechange(String Id, String company1){
         for (int i = 0; i < size ; i++) {
             if (employees[i].getEmplyeeID().contains(Id)){
                 employees[i].setCompany(company1);
                 System.out.println(employees[i]);
             }
         }
         return null;
     }
     public Employee activEmployee(String id, boolean activ1){
         for (int i = 0; i < size; i++) {
             if (employees[i].getEmplyeeID().contains(id)){
                 activ1 = false;
                 employees[i].setActiv(activ1);
             }
         }
         return null;
     }
    public Employee activateEmployeeByid(String iD, boolean active2){
        for (int i = 0; i < size ; i++) {
            if (employees[i].getEmplyeeID().contains(iD)) {
                active2 = true;
                employees[i].setActiv(active2);
            }
        }
        return null;
    }
    public void employeesActivprint() {
        for (int i = 0; i < size; i++) {
            if (employees[i].isActiv() == true){
                System.out.println(employees[i] + ",");
            }
        }
    }
}
