import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employees{
    private int id;
    private String name;
    private int salary;

    public Employees(){

    }

    public Employees(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
public class Sorting {
    public static void main(String[] args) {
        Employees e1 = new Employees(1, "Rahul", 10000);
        Employees e2 = new Employees(2, "Varun", 2000);
        Employees e3 = new Employees(3, "Gautam", 3000);

        List<Employees> elist = new ArrayList<>();
        elist.add(e1);
        elist.add(e2);
        elist.add(e3);

        List<Employees> sort = elist.stream().sorted(Comparator.comparingInt(Employees::getSalary)).toList();
        System.out.println(sort);
    }
}
