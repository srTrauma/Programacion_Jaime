package Programa_sergio;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        funcGame();

    }

    public static void funcGame() {
        Scanner sc = new Scanner(System.in);
        int condicionDeGanar = 10;
        
        
        long vida = 100;

       while (vida > 0){
            long random1 = Math.round(Math.random() * 100);
            long random2 = Math.round(Math.random() * 100);
            long vidaPerdida = Math.round(Math.random() * 10);
            
            long suma = random1 + random2;
            System.out
                    .println("Si falla la vida a perder sera " + vidaPerdida + "\n  Porfavor inserte su nº a continuacion");
            System.out.println(random1 + "+" + random2);

            int userImput = sc.nextInt();

            if (userImput == suma) {
                condicionDeGanar --;
                System.out.println("Buena");
                System.out.println(condicionDeGanar);

                if (condicionDeGanar == 0) {

                    System.out.println("Juego terminado");

                    break;
                }
            } else {

                System.out.println("Fallaste");

                long perdida = (vida - vidaPerdida);

                vida = perdida;
                System.out.println(vida);
            }
        } 
    }
}
