public class gater_and_setter_method {
    public static void main(String[] args) {
        employInfo sc = new employInfo();
        sc.setName("sugat");
        sc.setSalary(15);
        sc.setSurname("moon");
        System.out.print("Your full name:"+sc.getName()+" ");
        System.out.println(sc.getSurname());
        System.out.println("Your Salary:"+sc.getSalary());

    }
}
class employInfo{
    private String name;
    private int salary;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
