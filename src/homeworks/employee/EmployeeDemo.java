package homeworks.employee;

import homeworks.employee.model.Company;
import homeworks.employee.model.Employee;
import homeworks.employee.storage.CompanyStorage;
import homeworks.employee.storage.EmployeeStorage;
import homeworks.employee.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
   private static Scanner scanner = new Scanner(System.in);
   private static EmployeeStorage employeeStorage = new EmployeeStorage();
   private static CompanyStorage companyStorage = new CompanyStorage();
    public static void main(String[] args) throws ParseException {

        boolean isRun = true;



        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEES:
                    addEmployee();
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case PRINT_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    getEmployeeById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_ID:
                    changeCompanyName();
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    searchEmployeeBySalaryrange();
                    break;
                case CHANGE_EMPLOYEE_POSITION:
                    changeemployeeposition();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEES:
                    employeeStorage.printByStatus(true);
                    break;
                case INACTIVATE_EMPLOYEE_BY_ID:
                    inactivateEmployeeByid();
                    break;
                case ACTIVATE_EMPLOYEE_BY_ID:
                    activateEmployee();
                    break;
                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                    break;
                default:
                    System.out.println("Wrong command. Please try again!!!");
            }
        }
    }

    private static void addCompany() {
        System.out.println("Please input id, name, address, phoneNumber");
        String companyDataStr = scanner.nextLine();
        String[] companyData = companyDataStr.split(",");
        String companyId = companyData[0];
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById == null){
            Company company = new Company(companyId,companyData[1],companyData[2],companyData[3]);
            companyStorage.add(company);
            System.out.println("Company was added!");
        }else {
            System.out.println("Company with " + companyId + " already exists!");
        }

    }


    private static void changeCompanyName() {
        companyStorage.print();
        System.out.println("Please input company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null){
            employeeStorage.searchEmployeeByCompany(companyById);
        }else{
            System.out.println("Company does not exists");
        }

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
        String companyr = scanner.nextLine();
        employeeStorage.companyNamechange(id,companyr);
    }

    private static void activateEmployee () {
        System.out.println("Enter the ID of an inactive employee to activate it");
        String idActivation = scanner.nextLine();
        boolean activ = true;
        employeeStorage.activateEmployeeByid(idActivation,activ);
    }

    private static void inactivateEmployeeByid() {
       employeeStorage.printByStatus(true);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.searchID(employeeId);
        if (employee == null || !employee.isActive()){
            System.out.println("Wrong employee ID, please try again!");
        }else {
            employee.setActive(false);
            System.out.println("Status changed!");
        }
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

    private static void addEmployee() throws ParseException {
        if (companyStorage.getSize() == 0) {
            System.out.println("Please add company first!");
            return;
        }
        companyStorage.print();
        System.out.println("Please choose company id");
        String companiId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companiId);
        if (companyById != null) {
            System.out.println("please input name, surname, employeeID, salary, company, position ");
            String employeeDataStr = scanner.nextLine();
            String[] employeeData = employeeDataStr.split(",");
            String employeeID = employeeData[2];
            Employee emplyeeID = employeeStorage.searchID(employeeID);
            if (employeeID != null) {
                Employee employee = new Employee(employeeData[0], employeeData[1], employeeID,
                        Double.parseDouble(employeeData[4]), companyById, employeeData[5],
                        new Date(), DateUtil.stringToDate(employeeData[6]));
                employeeStorage.add(employee);
                companyById.setId(companiId);
                System.out.println("Employee was added! ");
            } else {
                System.out.println("Employee with " + employeeID + " id already exists ");
            }
        }else {
            System.out.println("Wrong company id! Please try again!");
        }
    }

}

