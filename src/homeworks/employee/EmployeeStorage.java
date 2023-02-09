package homeworks.employee;

import java.util.Scanner;

public class EmployeeStorage {

    private static Employee [] array = new Employee[100];

    private static int size = 0;
    public static void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }
    private static void extend() {

        Employee[] tmp = new Employee[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }public static void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void searchID(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++){
            Employee employee = array[i];
            if (employee.getEmplyeeID().contains(keyword)){
                found = true;
                System.out.println(employee);
            }
        }
        if  (!found){
            System.out.println("Employee with " + keyword + " does not exists");
        }
    }
    public static void searchCompany(String keyword2) {
        boolean found = false;
        for (int i = 0; i < size; i++){
            Employee employee = array[i];
            if (employee.getCompany().contains(keyword2)){
                found = true;
                System.out.println(employee);
            }
        }
        if  (!found){
            System.out.println("Employee with " + keyword2 + " does not exists");
        }

    }
    void PrintScan(){
        Scanner scanner = new Scanner(System.in);
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

    }
}
