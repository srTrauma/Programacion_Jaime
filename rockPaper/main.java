package rockPaper;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scRoc = new Scanner(System.in);

        long Paper = 1;
        long Rock = 2;
        long Scissor = 3;
        System.out.println("Jugador 1, indique que va a jugar"+"\n1.Papel"+"\n2.Piedra"+"\n3.Tijera");
        int jugador1Input = scRoc.nextInt();
        System.out.println("---------------------------------------------------------------");
        long jugadorMaquinaInput = Math.round(Math.random()*3);

        if(jugador1Input + jugadorMaquinaInput == 1){
            System.out.println("pasan cosas");
        }else{
            System.out.println("no pasan cosas");
        }
    }
}
