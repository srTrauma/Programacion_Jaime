package Interface_Tests;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class label {
    
    public label(String lbltext){

        ImageIcon image = new ImageIcon("./Assets/icon.png","labelImg");//crea una imagen

        Border border = BorderFactory.createLineBorder(Color.red,2);

        JLabel label = new JLabel();

        label.setText(lbltext);//esto pone un texto

        label.setIcon(image);//esto pone una imagen en una label que es como un componente de react

        label.setHorizontalTextPosition(JLabel.CENTER);// esto cambia la posion del texto( no se si respecto a la imagen o en general), las opciones son left, right, center

        label.setVerticalTextPosition(JLabel.TOP);// esto cambia la posicion del texto en vertical( no se si respecto a la imagen o en general), las opciones son las mismas

        label.setForeground(Color.black);// esto cambia el color de la letra

        label.setFont(new Font("MV Boli",Font.BOLD, 20 ));// esto cambia la fuente del texto

        label.setIconTextGap(-20);// esto cambia el gap que hay respecto a la imagen desde tu texto/label

        label.setBackground(Color.yellow);//set background color, esto solo funciona si y solo si la label es opaca

        label.setOpaque(true);//esto dice que nuestra label es opaca
        
        label.setBorder(border);//le pongo un border a la label

        label.setVerticalAlignment(JLabel.CENTER);// esto alinea verticalmente nuestra label entera
        
        label.setHorizontalAlignment(JLabel.CENTER);// esto alinea horizontalmente nuestra label entera
        
        //label.setBounds(20, 20, 400, 400); esto añade posicionamiento de forma manual
    
//-----------------------------------------------------------------------------------------

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(image.getImage());
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);
        frame.setBackground(Color.black);

        frame.pack();//esto hace que el tamaño de la ventana sea del tamaño de lka lbl
        //frame.setLayout(null);esto dice que va a usar para poder gestionar las labels
        
    }
}
