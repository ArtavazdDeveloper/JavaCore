package homeworks.employee;


import java.util.Objects;

public class Employee {

   private String name;
   private String surname;
   private String emplyeeID;
   private double salary;
   private String company;
   private String position;

    public Employee() {
    }

    public Employee(String name, String surname, String emplyeeID, double salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.emplyeeID = emplyeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmplyeeID() {
        return emplyeeID;
    }

    public void setEmplyeeID(String emplyeeID) {
        this.emplyeeID = emplyeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        if (!Objects.equals(name, employee.name)) return false;
        if (!Objects.equals(surname, employee.surname)) return false;
        if (!Objects.equals(emplyeeID, employee.emplyeeID)) return false;
        if (!Objects.equals(company, employee.company)) return false;
        return Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (emplyeeID != null ? emplyeeID.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emplyeeID='" + emplyeeID + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
