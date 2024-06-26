import java.awt.*;
import  javax.swing.*;

public class tes{
   
    class Main {
        public static  void main(String[] args){
            JFrame f1= new JFrame();
            f1.setSize(200, 200);
            f1.setLayout(new FlowLayout());
            ImageIcon i1 = new ImageIcon("D//..");
            f1.add(new JLabel(i1));
            f1.setVisible(true);
        }
    } 
}

