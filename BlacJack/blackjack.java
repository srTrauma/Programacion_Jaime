package BlacJack;

import java.util.Scanner;

public class blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cartas = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K" };
        int iterationNumber = 0;
        int genRandom = (int) Math.round(Math.random() * 12);
        int genRandom2 = (int) Math.round(Math.random() * 12);

        if (genRandom == 10 || genRandom == 11 || genRandom == 12) {
            genRandom = 9;
        }
        if (genRandom2 == 10 || genRandom2 == 11 || genRandom2 == 12) {
            genRandom2 = 9;
        }
        if (genRandom == 0 && genRandom2 == 10 || genRandom == 0 && genRandom2 == 11
                || genRandom == 0 && genRandom2 == 12) {
            System.out.println("BlackJack");
        }
        if (genRandom2 == 0 && genRandom == 10 || genRandom2 == 0 && genRandom == 11
                || genRandom2 == 0 && genRandom == 12) {
            System.out.println("BlackJack");
        }

        int genRandomWorks = genRandom + 1;
        int genRandomWorks2 = genRandom2 + 1;

        int resultado = genRandomWorks + genRandomWorks2;

        System.out.println("Sus cartas son " + cartas[genRandom] + " " + cartas[genRandom2] + "\nEl total es: "
                + (genRandomWorks + genRandomWorks2));
        System.out.println("------------------------------------------");

        System.out.println("Quiere una carta ?" + "\n1. Para seguir" + "\n2. Para parar de repartir");
        int pedir = sc.nextInt();
        System.out.println("------------------------");
        boolean keepup = true;
        switch (pedir) {
            case 1:

                int CartasHumano = 0;
                int CartasMach;
                do {

                    int cardAdded = 0;
                    keepup = false;

                    if (resultado > 21) {
                        System.out.println("Se ha pasado, ha perdido");
                        keepup = false;
                    } else {
                        int addCard = (int) Math.round(Math.random() * 12);
                        if (addCard == 10 || addCard == 11 || addCard == 12) {
                            addCard = 9;
                        }
                        if (iterationNumber == 0) {
                            int addCardworks = addCard + 1;
                            System.out.println("Su nueva carta es:");
                            System.out.println(addCardworks);
                            System.out.println("------------------------------------------");

                            cardAdded = resultado + addCardworks;
                            CartasHumano = cardAdded;
                            System.out.println(CartasHumano);
                        } else {
                            cardAdded = resultado;
                        }
                        if (cardAdded > 21) {
                            System.out.println("Se ha pasado");
                            keepup = false;
                        } else {
                            System.out.println("su nueva cantidad es:" + cardAdded);
                            int newVal = conitnues(cardAdded);
                            if (newVal != 0) {
                                CartasHumano = newVal;
                                System.out.println("nueva carta?");
                                int cont = sc.nextInt();
                                System.out.println("------------------------");
                                if (cont == 1) {
                                    
                                    resultado = newVal;
                                    CartasHumano = resultado;
                                    System.out.println("su nuevo valor depues de robar es:" + resultado);
                                    if (resultado > 21) {
                                        System.out.println("Ha sido eliminado");
                                        keepup = false;
                                    }
                                    keepup = true;
                                    if (newVal > 21) {
                                        System.out.println("Ha perdido");
                                        keepup = false;
                                    }
                                }
                            }

                        }
                        iterationNumber++;
                    }

                } while (keepup == true);
                 System.out.println(CartasHumano);
                boolean aicondition = true;
                do {
                    int cartaIa1 = (int) Math.round(Math.random() * 10);
                    int cartaIa2 = (int) Math.round(Math.random() * 10);
                    int total_maquina = cartaIa1 + cartaIa2;
                    if (total_maquina < 14) {
                        int robar = (int) Math.round(Math.random() * 10);
                        total_maquina = total_maquina + robar;
                    }
                    if (total_maquina < 15) {
                        int robar2 = (int) Math.round(Math.random() * 10);
                        total_maquina = total_maquina + robar2;
                        System.out.println("La maquina ha sacado\n" + total_maquina);
                        
                    } else {
                        System.out.println("La maquina ha sacado\n" + total_maquina);
                        
                    }
                    CartasMach = total_maquina;

                    aicondition = false;
                } while (aicondition);
                
                    if (CartasMach > CartasHumano ) {
                        System.out.println("Ha ganado la maquina");
                    }
                    if (CartasHumano > CartasMach ) {
                        System.out.println("Ha ganado el humano");
                    }
                    if (CartasHumano == CartasMach) {
                        System.out.println("Empate");
                    }
                break;
            default:

                System.out.println("carta incorrecta");
                break;
        }

        sc.close();
    }

    public static int conitnues(int valor) {
        int newCard = (int) Math.round(Math.random() * 10);

        int nuevoValor = valor + newCard;

        return nuevoValor;
    }
}
