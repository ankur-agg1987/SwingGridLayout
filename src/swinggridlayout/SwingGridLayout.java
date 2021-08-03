package swinggridlayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingGridLayout {

    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Grid Layout Demo");
        
        f.setLayout(new GridLayout(4, 2));
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // we need to consider the flow of adding the components in container with gridlayout
         f.add(new JButton("Button Three"));
    f.add(new JButton("Button Four"));
    f.add(new JButton("Button One"));
     f.add(new JButton("Button Five"));
    f.add(new JButton("Button Two"));
   
   ;
    f.add(new JButton("Button Six"));
    f.add(new JLabel("Hello"));
    f.add(new JButton("Button Seven"));
    
    
    f.setSize(400, 400);
    f.setVisible(true);
    }
    
}
