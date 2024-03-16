

import java.awt.*;
class MyFrame extends Frame {
    Label l;
    TextField ta;
    Button b;
    public MyFrame () {
        super("Seond Application");
        setLayout(new FlowLayout());
        l = new Label("Name");
        ta = new TextField(20);
        b = new Button("OK");
        add(l);
        add(ta);
        add(b);
    }
}

public class secondApp {
    public static void main(String[] args) {
     MyFrame mf =new MyFrame();
        mf.setSize(400,400);
        mf.setVisible(true );
    }
}
