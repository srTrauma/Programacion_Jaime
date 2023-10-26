package ejercicio_clase_1;

import java.util.Scanner;

public class ejer {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
                27, 28, 29, 30 };
        Scanner sc = new Scanner(System.in);
        boolean initCondition = true;
        do {
            System.out

                    .println("Inserte con que blucle quiera realizar la accion \n1:For.\n2.While\n3.forEach\n4.Cerrar");

            int opcion = sc.nextInt();
            System.out.println("-----------------------");
            switch (opcion) {
                case 1:
                    for (int l = 0; l < numeros.length; l++) {
                        if (findOdd(l, numeros) != 0) {
                            System.out.println(numeros[l]);

                        }
                    }
                    System.out.println("-----------------------");
                    int[] forInverso = FunctionReverse(numeros);
                    for (int l = forInverso.length - 1; l >= 0; l--) {
                        if (findOdd(l, numeros) != 0) {
                            System.out.println(forInverso[l]);

                        }
                    }

                    break;
                case 2:
                    System.out.println("Ha ejecutado un bucle while");

                    boolean condition = true;
                    int indexArr = 0;
                    while (condition == true) {
                        if (findOdd(indexArr, numeros) != 0) {
                            System.out.println(numeros[indexArr]);
                        }
                        if (indexArr == 29) {
                            condition = false;
                        }
                        indexArr = indexArr + 1;
                    }
                    System.out.println("------------------------------------------------");
                    // ------------------------------------------------------------

                    int[] reverseWhile = FunctionReverse(numeros);
                    boolean conditionReverse = true;
                    int indexArrReverse = numeros.length - 1;
                    while (conditionReverse == true) {
                        if (findOdd(indexArrReverse, reverseWhile) != 0) {
                            System.out.println(reverseWhile[indexArrReverse]);
                        }
                        if (indexArrReverse == 0) {
                            conditionReverse = false;
                        }
                        indexArrReverse--;
                    }
                    System.out.println("Bucle while terminado");
                    System.out.println("-----------------------");
                    break;

                case 3:
                    System.out.println("Ha ejecutado un bucle forEach");
                    int indexForEach = 0;
                    for (int numero : numeros) {

                        if (findOdd(indexForEach, numeros) != 0) {
                            System.out.println(numero);
                        }
                        indexForEach++;
                    }
                    System.out.println("Bucle forEach terminado");
                    System.out.println("-----------------------");
                    break;
                case 4:
                    initCondition = false;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (initCondition == true);
        sc.close();
    }

    public static int findOdd(int index, int[] Lista) {
        int funAnswer = Lista[index];
        int returnValue = funAnswer % 2;
        return returnValue;
    }

    public static int[] FunctionReverse(int[] Lista) {

        for (int i = 29; i > Lista.length; i--) {

            if (findOdd(i, Lista) != 0) {
                System.out.println(Lista[i]);
            }

        }

        return Lista;
    }
}