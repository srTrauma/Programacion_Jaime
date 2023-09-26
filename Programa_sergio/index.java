package Programa_sergio;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        funcGame();

    }

    public static void funcGame() {
        Scanner sc = new Scanner(System.in);
        double condicionDeGanar = 10;
        
        
        double vida = 100;

       while (vida > 0){
            double random1 = Math.round(Math.random() * 100);
            double random2 = Math.round(Math.random() * 100);
            double vidaPerdida = Math.round(Math.random() * 10);
            
            double suma = random1 + random2;
            System.out
                    .println("Si falla la vida a perder sera" + vidaPerdida + "Porfavor inserte su nº a continuacion");
            System.out.println(random1 + "+" + random2);

            Double userImput = sc.nextDouble();

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

                double perdida = (vida - vidaPerdida);

                vida = perdida;
                System.out.println(vida);
            }
        } 
    }
}
