package Calculator;
import java.awt.*;    
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class index {

    
    public static void main(String[] args) {
       new index();
        
    }

    public index(){
        JFrame clacFrame = new JFrame(); 
        JPanel clacPanel = new JPanel();
        

        clacPanel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        clacPanel.setLayout(new GridLayout(0, 1, 2, 4));

        clacFrame.add(clacPanel, BorderLayout.CENTER);
        clacFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clacFrame.setTitle("Calc");
        clacFrame.pack();
        clacFrame.setVisible(true);
    }
    

}