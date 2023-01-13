interface besicAnimal{
    void eat();
    void sleep();
}
public class human extends monkey implements besicAnimal {
    public void eat(){
        System.out.println("This is besic animal.It can eat vegetables.");
    }
    public void sleep(){
        System.out.println("He can alse sleep like living being.");
    }

    public static void main(String[] args) {
        monkey m = new monkey();
        human h = new human();
        m.jump();
        m.bite();
        h.eat();
        h.sleep();


    }

}
class monkey {
    public void jump(){
        System.out.println("Monkey can jumping on tree.");
    }
    public void bite(){
        System.out.println("Monkey can be bite.");
    }

}
