package rockPaper;

import java.util.Scanner;

public class RPSmain {
    public static void main(String[] args) {
        try (Scanner scRoc = new Scanner(System.in)) {
            long Paper = 1;
            long Rock = 2;
            long Scissor = 3;
            System.out.println("Jugador 1, indique que va a jugar"+"\n1.Papel"+"\n2.Piedra"+"\n3.Tijera" + "\n---------------------------------------------------------------");
            int jugador1Input = scRoc.nextInt();
            System.out.println("---------------------------------------------------------------");
            int jugadorMaquinaInput =(int)(Math.random() * 3 ) + 1;
            System.out.println("La maquina ha elegido "+jugadorMaquinaInput);

            if(jugador1Input == jugadorMaquinaInput ){
                System.out.println("empate");
            }
            // Ganas
            if(jugador1Input == Scissor && jugadorMaquinaInput == Paper  ){
                System.out.println("Has Ganado");
            }if(jugador1Input == Rock && jugadorMaquinaInput == Scissor  ){
                System.out.println("Has Ganado");
            }if(jugador1Input == Paper && jugadorMaquinaInput == Rock  ){
                System.out.println("Has Ganado");
            }
            // Pierdes
            if(jugador1Input == Paper && jugadorMaquinaInput == Scissor  ){
                System.out.println("Has Perdido");
            }
            if(jugador1Input == Scissor && jugadorMaquinaInput == Rock  ){
                    System.out.println("Has Perdido");
            }
            if(jugador1Input == Rock && jugadorMaquinaInput == Paper  ){
                System.out.println("Has Perdido");
            }
        }
}
}