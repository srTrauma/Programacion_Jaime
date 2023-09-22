package Calculator;
import java.awt.*;
import javax.swing.*;

public class label {
    
    public label(){
        ImageIcon image = new ImageIcon("./Assets/icon.png","labelImg");
        JLabel label = new JLabel();

        label.setText("Test");//esto pone un texto
        label.setIcon(image);//esto pone una imagen en una label que es como un componente de react
        label.setHorizontalTextPosition(JLabel.CENTER);// esto cambia la posion del texto, las opciones son left, right, center
        label.setVerticalTextPosition(JLabel.BOTTOM);
//-----------------------------------------------------------------------------------------
        JFrame frame = new JFrame();
        frame.setIconImage(image.getImage());
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);
    }
}
