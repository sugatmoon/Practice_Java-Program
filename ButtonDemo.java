
import java.awt.*;
import java.awt.event.*;
class MyFrame2 extends Frame implements ActionListener{
    int count = 0;
    Label l;
    Button b;
    public MyFrame2 () {
        super("Button Demo");
        l = new Label("    " + count);
        b = new Button("Click");
        b.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(b);
    }
    public void actionPerformed(ActionEvent e) {
        count ++;
        l.setText("" + count);
    }
}



public class ButtonDemo {
    public static void main(String[] args) {
        MyFrame2 fm = new MyFrame2();
        fm.setSize(400, 400);
        fm.setVisible(true);
    }
}
