import java.util.Objects;

public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private final int id;

    public Employee(String fullName, int department, double salary, int id) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Имя: '%s' (Отдел %d, Зарплата %.2f, ID %d)",
                fullName, department, salary, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, id);
    }
}
