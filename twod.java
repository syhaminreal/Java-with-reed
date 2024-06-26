import java.awt.*;

import javax.swing.*;

public class twod {

    
   
        public static void main(String[]args) {
            JFrame f1 = new JFrame();
            f1.setSize(200, 200);
            JPanel p1=new JPanel(){
                public void paint (Graphics g){

                           /*now the 2 d shapes*/
                    g.setColor(Color.blue);
                    g.fillRect(10, 12, 100, 100);
                    g.setColor(Color.red);
                    g.fillOval(10, 12, 100, 100);
                    g.setColor(Color.pink);
                    g.drawRect(10, 12, 100, 100);
                    g.setColor(Color.green);
                    g.drawLine(10, 12, 124, 200);


                    /*now the image  */
                    Toolkit t1= Toolkit.getDefaultToolkit();
                    Image i1= t1.getImage("./le.webp");
                    g.drawImage(i1, 100, 150,Color.red, this);
                }
            };
            f1.add(p1);
            f1.setVisible(true);
        }
    }
    
    

