package Calculator_Scanner;
import java.util.Scanner;

public class functionClaculadora {
    public functionClaculadora() {
        try (Scanner cScanner = new Scanner(System.in)) {
            System.out.println(
                    "Inserte la operacion, las opciones son:\n1.Suma \n2.Resta \n3.Division \n4.Multiplicacion. \n5.Raiz\n6.Potencia  \nInstertar solo el numero al lado de la operacion");

            int operation = cScanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Inserte el 1º numero de la operacion, debe ser un numero decimal");

                    float num1Suma = cScanner.nextFloat();

                    System.out.println("Inserte el 2º numero de la operacion, debe ser un numero decimal");

                    float num2Suma = cScanner.nextFloat();
                    float result = num1Suma + num2Suma;
                    
                    if (result == 69) {
                        System.out.println("nice");
                    } else {
                        System.out.println("El resultado es:\n");
                        System.out.println(result);
                    }
                    break;
                case 2:
                    System.out.println("Inserte el 1º numero de la operacion, debe ser un numero decimal");

                    float num1Resta = cScanner.nextFloat();

                    System.out.println("Inserte el 2º numero de la operacion, debe ser un numero decimal");

                    float num2Resta = cScanner.nextFloat();
                    
                    float resultResta = num1Resta - num2Resta;
                    
                    if (resultResta == 69) {
                        System.out.println("nice");
                    } else {
                        System.out.println("El resultado es:\n");
                        System.out.println(resultResta);
                    }
                    break;
                case 3:
                    System.out.println("Inserte el 1º numero de la operacion, debe ser un numero decimal");

                    float num1Division = cScanner.nextFloat();

                    System.out.println("Inserte el 2º numero de la operacion, debe ser un numero decimal");

                    float num2Division = cScanner.nextFloat();
                    System.out.println("El resultado es:\n");
                    System.out.println(num1Division / num2Division);
                    break;
                case 4:
                    System.out.println("Inserte el 1º numero de la operacion, debe ser un numero decimal");

                    float num1Multi = cScanner.nextFloat();

                    System.out.println("Inserte el 2º numero de la operacion, debe ser un numero decimal");

                    float num2Multi = cScanner.nextFloat();
                    System.out.println("El resultado es:\n");
                    System.out.println(num1Multi * num2Multi);
                    break;
                case 5:
                    System.out.println("Inserte el numero del que quiere realizar la raiz:");
                    Double numSqrt = cScanner.nextDouble();
                    System.out.println("El resultado es:\n");
                    System.out.println(Math.sqrt(numSqrt));
                    break;
                case 6:
                    System.out.println(
                            "Inserte el numero del que quiere realizar la POTENCIA:");
                    Double numPow = cScanner.nextDouble();
                    System.out.println("Inserte la base a la que elevar el numero anterior");
                    Double numPowExponent = cScanner.nextDouble();
                    System.out.println("El resultado es:\n");
                    System.out.println(Math.pow(numPow, numPowExponent));
                    break;
                default:
                    System.out.println("Operacion Invalida, intente con un numero del 1-6");
                    break;
            }
        }

    }
}