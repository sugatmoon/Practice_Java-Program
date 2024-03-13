


public class genericClass<T> {
    T obj[] =(T[]) new Object[4];
    public static void main(String[] args) {
        genericClass items = new genericClass<>();
        items.obj[0] = "sugat";
        items.obj[2] = "Son";
        items.obj[1] = "Moon";
        items.obj[1] = 2;


        for (int i = 0; i< items.obj.length; i++ ) {

        System.out.println(items.obj[i]);
        }



    }
}
