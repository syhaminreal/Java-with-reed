import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class table {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("Test");
        f1.setSize(200, 200);
        f1.setLayout(new FlowLayout());
        f1.setLocation(450, 250);
CardLayout c1 = new CardLayout();

        JCheckBox j1 = new JCheckBox("Dancing");
        j1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("You like dancing");
                } else {
                    System.out.println("You don't like dancing");
                }
            }
        });
        f1.add(j1);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
