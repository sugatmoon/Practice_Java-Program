class EmInfo{
    int salary;
    public void getSalary(){
        System.out.println("Salary:"+salary);
    }
    String name;
    public void getName(){
        System.out.println("Name:"+name);
    }
    public void setName(){
        String n = name;
        System.out.println(n);
    }
}
public class EmployerInfo {
    public static void main(String[] args) {
    EmInfo inst = new EmInfo();
    inst.salary = 54;
    inst.name ="Sugat";
    inst.getName();
    inst.getSalary();
    inst.setName();

    }
}