package Programa_sergio;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        funcGame();

    }

    public static void funcGame() {
        try (Scanner sc = new Scanner(System.in)) {
            int condicionDeGanar = 10;
            
            
            long vida = 100;

      while (vida > 0){
                long random1 = Math.round(Math.random() * 100);
                long random2 = Math.round(Math.random() * 100);
                long vidaPerdida = Math.round(Math.random() * 50);
                
                long suma = random1 + random2;
                System.out
                        .println("Si falla la vida a perder sera " + vidaPerdida + "\nPorfavor inserte su nº a continuacion");
                System.out.println(random1 + "+" + random2);

                int userImput = sc.nextInt();

                if (userImput == suma) {
                    condicionDeGanar --;
                    System.out.println("Respuesta correcta");
                    System.out.println("Le quedan "+condicionDeGanar+" preguntas correctas para ganar");

                    if (condicionDeGanar == 0) {

                        System.out.println("Juego terminado, Enhorabuena");

                        break;
                    }
                } else {

                    System.out.println("Error");

                    long perdida = (vida - vidaPerdida);

                    vida = perdida;
                    System.out.println("Le quedan " + vida + " puntos de vida.");
                    if(vida <= 0){
                        System.out.println("Ha perdido");
                        break;
                    }
                }
            }
        } 
    }
}
