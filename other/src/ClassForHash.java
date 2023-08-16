import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

public class ClassForHash {
    public static void main(String[] args) {
        Map<Employee, Integer> m = new HashMap<>();
        Employee e2 = new Employee("Mercedes", 21000);

        m.put(new Employee("Julio", 20000), 20000);
        m.put(e2, 21000);

        Employee e3 = new Employee("Mercedes", 21000);
        System.out.println(m.get(e3));
    }
}


class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }
    public int getSalary() {
        return this.salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        else if (o == null || getClass() != o.getClass()) return false;
        Employee e = (Employee) o;
        return this.name.equals(e.getName()) && this.salary == e.getSalary();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.salary);
    }
}