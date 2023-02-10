package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        boolean isRun = true;

        while(isRun){
            System.out.println("Please input 0 exit ");
            System.out.println("Please input 1 for add employee ");
            System.out.println("Please input 2 for print all employee ");
            System.out.println("Please input 3 for search employee by employee ID ");
            System.out.println("Please input 4 for search employee by company name ");
            String command = scanner.nextLine();
            switch (command){
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("please input name's employee");
                    String name = scanner.nextLine();
                    System.out.println("please input surname's  employee");
                    String surname = scanner.nextLine();
                    System.out.println("please input emplyeeID ");
                    String emplyeeID = scanner.nextLine();
                    System.out.println("please input salary's employee ");
                    String salary = scanner.nextLine();
                    System.out.println("please input company's employee ");
                    String company = scanner.nextLine();
                    System.out.println("please input position's employee");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name,  surname, emplyeeID,Double.parseDouble(salary), company, position );
                    EmployeeStorage.add(employee);
                    System.out.println("Employee is created");
                    break;
                case "2":
                    EmployeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    EmployeeStorage.searchID(keyword);
                    break;
                case "4":
                    System.out.println("Please input keyword");
                    String keyword2 = scanner.nextLine();
                    EmployeeStorage.searchCompany(keyword2);
                    break;
                default:
                    System.out.println("Wrong command. Please try again.");
            }

        }

    }
    }

