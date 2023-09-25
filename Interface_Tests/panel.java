package Interface_Tests;

import java.awt.Color;

import javax.swing.*;
import java.awt.*;
public class panel {
    public panel(){
        ImageIcon image = new ImageIcon("./Assets/icon.png","panelImg");

        JPanel Cyanpanel = new JPanel();
        Cyanpanel.setBackground(Color.CYAN);
        Cyanpanel.setBounds(0,0,250,250);
       
        

        JPanel Redpanel = new JPanel();
        Redpanel.setBackground(Color.red);
        Redpanel.setBounds(0,250,270,270);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,520,290,290);
        //-----------------------------------------------------------------------------------------
        JLabel label = new JLabel();
        label.setText("reaz la 2pa");
        label.setOpaque(false);
        label.setFont(new Font("MV Boli",Font.BOLD, 20 ));
        label.setIcon(image);
        //-----------------------------------------------------------------------------------------

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(image.getImage());
        frame.setSize(750, 1080);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setTitle("panel test");
        frame.add(Cyanpanel);
        frame.add(Redpanel);
        frame.add(greenPanel);
        
        greenPanel.add(label);
        Redpanel.add(label);
    }
}
