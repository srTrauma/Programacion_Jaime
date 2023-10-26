package ejercicio_clase_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejer2Main {
    public static void main(String[] args) {
        boolean initCondition = true;
        
        boolean catchao = true;
        while (initCondition == true) {
            
            System.out.println("Inserte la hora, inserte un numero superior a 23 para salir del bucle");
            do {

                try {
                    Scanner sc = new Scanner(System.in);
                    int horaInput = sc.nextInt();
                    if (horaInput >= 0 && horaInput <= 12) {
                        System.out.println("Buenos dias");
                        catchao = false;
                    }
                    if (horaInput > 12 && horaInput <= 21) {
                        System.out.println("Buenas tardes");
                        catchao = false;
                    } else {
                        System.out.println("Buenas noches");
                        catchao = false;
                    }

                } 
                catch (InputMismatchException e) {
                    System.out.println("Vuelva a insertar un dato numerico comprendido entre 0 y 23");
                    catchao = true;
                }
            } while (catchao == true);
        }
       
    }

}