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
        Employees e1 = new Employees(1, "Rahul", 9000);
        Employees e2 = new Employees(2, "Varun", 2000);
        Employees e3 = new Employees(3, "Gautam", 3000);
        Employees e4 = new Employees(3, "Gautam", 8000);
        Employees e5 = new Employees(3, "Gautam", 3000);
        Employees e6 = new Employees(3, "Gautam", 7000);
        Employees e7 = new Employees(3, "Gautam", 5000);

        List<Employees> elist = new ArrayList<>();
        elist.add(e1);
        elist.add(e2);
        elist.add(e3);
        elist.add(e4);
        elist.add(e5);
        elist.add(e6);
        elist.add(e7);

        //Ascending Order
        List<Employees> sortASC = elist.stream().sorted(Comparator.comparingInt(Employees::getSalary)).toList();
        System.out.println(sortASC);

        //Descending Order
        List<Employees> sortDESC = elist.stream().sorted(Comparator.comparingInt(Employees::getSalary).reversed()).toList();
        System.out.println(sortDESC);
    }
}
