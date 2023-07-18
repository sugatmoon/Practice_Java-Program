
import java.awt.*;
public class firstApp {
    public static void main(String[] args) {
        Frame f  = new Frame("My first App");
        f.setLayout(new FlowLayout());

        Button b = new Button("OK");
        Label l = new Label("Name");
        TextField tf = new TextField("Address: ", 20 );
        f.add(l);
        f.add(b);
        f.add(tf);




        f.setSize(300,300);
        f.setVisible(true);
    }
}
