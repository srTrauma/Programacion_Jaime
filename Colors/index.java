package Colors;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int Rojo = 0;
        int Verde = 1;
        int Amarillo = 2;
        int Azul = 3;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" las opciones son:" + "\n" + Rojo + "|" + "Rojo" + "\n" + Verde + "|" + "Verde" + "\n"
                    + Amarillo + "|" + "Amarillo" + "\n" + Azul + "|" + "Azul");
            System.out.println("Ponga el 1º Color");
            int suma = sc.nextInt();
            System.out.println("Ponga el 2º Color");
            int suma2 = sc.nextInt();

            int suma_total = suma + suma2;
            switch (suma_total) {
                case 1 + 2:
                    System.out.println("Negro");
                    break;
                case 0 + 1:
                    System.out.println("Gris");
                    break;
                case 1 + 1:
                    System.out.println("Verde fuerte");
                    break;
                case 2 + 3:
                    System.out.println("Morado");
                    break;
                case 3 + 1:
                    System.out.println("marron");
                    break;
                default:
                    System.out.println("no, hay combinacion pruebe de nuevo");
                    break;
            }
        }
    }
}
