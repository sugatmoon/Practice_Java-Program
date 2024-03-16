class parant {
    public parant() {
        System.out.println("Inside the parent constuctor");
    }
}
class child extends parant {
    public child () {
        System.out.println("Inside the child constuctor");
    }
}
class grantchild extends child {
    public grantchild () {
        System.out.println("Inside the grantchild condunctor");
    }
}
public class constuctor_execution {
    public static void main(String[] args) {
        grantchild gc = new grantchild();
    }
}
