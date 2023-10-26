package Colors;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Inserte el color, ls opciones son:" + "\nAzul" + "\nRojo" + "\nVerde");
            System.out.println("Ponga el 1º Color");
            String color = sc.next();
            System.out.println("Ponga el 2º Color");
            String color2 = sc.next();
            if (color.equalsIgnoreCase("Azul") && (color2.equalsIgnoreCase("Rojo")) || (color.equalsIgnoreCase("Rojo") && (color2.equalsIgnoreCase("Azul")))) {
                System.out.println("Marron");
            }
            if (color.equalsIgnoreCase("Verde") && (color2.equalsIgnoreCase("Rojo"))|| (color.equalsIgnoreCase("Rojo") && (color2.equalsIgnoreCase("Verde")))) {
                System.out.println("Morado");
            }
            if (color.equalsIgnoreCase("Rojo") && (color2.equalsIgnoreCase("Verde"))|| (color.equalsIgnoreCase("Verde") && (color2.equalsIgnoreCase("Rojo")))) {
                System.out.println("Negro");
            }

        }
    }
}