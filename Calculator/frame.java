package Calculator;

import java.awt.*;
import javax.swing.*;

public class frame extends JFrame {

    public frame(){
        ImageIcon image = new ImageIcon("./Assets/icon.png","damn");

        //  Frame.add(Panel, BorderLayout.CENTER);  // ni puta idea
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Esto hace que se cierre al darle a la X de arriba
        //  this.setResizable(false); Esto hace la venata NO resizeable
        // this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); Esto hace que al ejecutar no se pueda cerrar la ventana
         this.setTitle("Calculadora");  //Esto pone un titulo a la ventana
         this.pack()    ;//esto hace que la ventana se ajuste a los "objetos" que hay dentro
         this.setSize(500, 500);// Aqui le dices el tamaño inicial de la ventana en px
         this.setVisible(true);// aqui dices que se pueda ver tu ventana
         this.setIconImage(image.getImage());// esto cambia el icono de la aplicacion
         this.getContentPane().setBackground(new Color(0x000222));//cambia el color de fondo 
     }  
}
