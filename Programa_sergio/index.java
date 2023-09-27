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
                System.out.println("Si falla la vida a perder sera " + vidaPerdida + "\nPorfavor inserte su nº a continuacion");
                System.out.println("La operacion a realizar es: "+random1 + "+" + random2);

                int userImput = sc.nextInt();

                if (userImput == suma) {
                    condicionDeGanar --;
                    System.out.println("Respuesta correcta");
                    System.out.println("Le quedan "+condicionDeGanar+" preguntas correctas para ganar");
                    System.out.println("---------------------------");

                    if (condicionDeGanar == 0) {
                        System.out.println("---------------------------");
                        System.out.println("Juego terminado, Enhorabuena");
                        System.out.println("---------------------------");

                        break;
                    }
                } else {
                    System.out.println("---------------------------");
                    System.out.println("Error");

                    long perdida = (vida - vidaPerdida);

                    vida = perdida;
                    System.out.println("Le quedan " + vida + " puntos de vida.");
                    System.out.println("---------------------------");
                    if(vida <= 0){
                        System.out.println("---------------------------");
                        System.out.println("Ha perdido");
                        System.out.println("---------------------------");
                        break;
                    }
                }
            }
        } 
    }
}
