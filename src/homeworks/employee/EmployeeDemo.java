package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {
   private static Scanner scanner = new Scanner(System.in);
   private static EmployeeStorage employeeStorage = new EmployeeStorage();
    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 exit ");
            System.out.println("Please input 1 for add employee ");
            System.out.println("Please input 2 for print all employee ");
            System.out.println("Please input 3 for search  by employee ID ");
            System.out.println("Please input 4 for search  by company name ");
            System.out.println("Please input 5 for search employee by salary range");
            System.out.println("Please input 6 for change employee position by id");
            System.out.println("Please input 7 for inactive employee by id");
            System.out.println("Please input 8 for activate employee by id");
            System.out.println("Please input 9 for print only active employees");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    getEmployeeById();
                    break;
                case "4":
                    changeCompanyName();
                    break;
                case "5":
                    searchEmployeeBySalaryrange();
                    break;
                case "6":
                    changeemployeeposition();
                    break;
                case "7":
                    inactivateEmployeeByid();
                    break;
                case "8":
                    activateEmployee();
                    break;
                case "9":
                    employeeStorage.employeesActivprint();
                    break;
                default:
                    System.out.println("Wrong command. Please try again!!!");
            }
        }
    }

    private static void changeCompanyName() {
        System.out.println("Please input company name");
        String companyName = scanner.nextLine();
        employeeStorage.searchCompany(companyName);
    }

    private static void searchEmployeeBySalaryrange() {
        System.out.println("Please input ");
        double salaryp  = Double.parseDouble(scanner.nextLine());
        double salaryp2 = Double.parseDouble(scanner.nextLine());
        employeeStorage.searchEmployee(salaryp,salaryp2);
    }

    private static void changeemployeeposition () {
        System.out.println("Please input  id for change company");
        String id = scanner.nextLine();
        String company2 = scanner.nextLine();
        employeeStorage.companyNamechange(id,company2);
    }

    private static void activateEmployee () {
        System.out.println("Enter the ID of an inactive employee to activate it");
        String idActivation = scanner.nextLine();
        boolean activ = true;
        employeeStorage.activateEmployeeByid(idActivation,activ);
    }

    private static void inactivateEmployeeByid() {
        System.out.println("Please input id for inactive employee");
        String idactiv = scanner.nextLine();
        boolean inactiv = false;
        employeeStorage.activEmployee(idactiv,inactiv);
    }

    private static void getEmployeeById() {
        System.out.println("Please input employee id");
        String employeeID = scanner.nextLine();
        Employee employee = employeeStorage.searchID(employeeID);
        if(employee == null){
            System.out.println("employee with " + employeeID + " id does exists");
        }else{
            System.out.println(employee);
        }
    }

    private static void addEmployee() {
        System.out.println("please input name, surname, employeeID, salary, company, position ");
        String employeeDataStr = scanner.nextLine();
        String[]employeeData = employeeDataStr.split(",");
        String employeeID = employeeData[2];
        Employee emplyeeID = employeeStorage.searchID(employeeID);
        if (employeeID != null) {
            Employee employee = new Employee(employeeData[0], employeeData[1],employeeID,
                    Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5]);
            employeeStorage.add(employee);
            System.out.println("Employee was added! ");
        }else{
            System.out.println("Employee with " +  employeeID + " id already exists ");
        }
    }

}

