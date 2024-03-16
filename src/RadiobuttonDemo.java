import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
class MyFrame4 extends Frame implements ItemListener {
    Label l;
    Checkbox c1, c2, c3;
    CheckboxGroup cbb;
    public MyFrame4 () {
        cbb = new CheckboxGroup();
        l = new Label("Nothis is Selected");
        c1 = new Checkbox("Java",false,cbb);
        c2 = new Checkbox("Python",false,cbb);
        c3 = new Checkbox("C#",false,cbb);




        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(c1);
        add(c2);
        add(c3);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str= "";
        if (c1.getState()) {
            str = str + " " + c1.getLabel();
        }
        if (c2.getState()) {
            str = str + " " + c2.getLabel();
        }
        if (c3.getState()) {
            str = str + " " + c3.getLabel();
        }
        if (str.isEmpty()) {
            str = "Nothis is Selected";
        }
        l.setText(str);
    }
}

public class RadiobuttonDemo {
    public static void main(String[] args) {
            MyFrame4 mf = new MyFrame4();
            mf.setSize(400,400);
            mf.setVisible(true);
    }

}
