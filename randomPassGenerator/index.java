package randomPassGenerator;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int index = 15;
         Scanner sc = new Scanner(System.in) ;
            System.out.println("Cuantas contraseñas quieren ser generadas");
            System.out.println("------------------------------------------------");
            int s = sc.nextInt();

            for (int i = 0; i < s; i++) {
                System.out.println(getRandomChar(index));
            }

        System.out.println("------------------------------------------------");
        System.out.println("todas las contraseñas han sido generadas");
        
    }

    static String getRandomChar(int index) {
        String generatorStringLow = "abc" + "123";
        String generatorStringMid = "abcdefghijk" + "123456789";
        String generatorStringTop = "abcdefghijklmopqrstuvwxyz" + "123456789";
        StringBuilder generator = new StringBuilder(index);

         Scanner scPScanner = new Scanner(System.in) ;
            System.out.println("Selecione un nivel de seguiridad siendo 3 el mas alto y 1 el mas bajo");

            System.out.println("------------------------------------------------");

            int slect = scPScanner.nextInt();
            if (slect == 1) {
                for (int l = 0; l < index; l++) {
                    int indiceL = (int) (generatorStringLow.length() * Math.random());
                    generator.append(generatorStringLow.charAt(indiceL));
                }
                return generator.toString();
            }
            if (slect == 2) {
                for (int l = 0; l < index; l++) {
                    int indiceL = (int) (generatorStringMid.length() * Math.random());
                    generator.append(generatorStringMid.charAt(indiceL));

                }
                return generator.toString();
            } else {
                for (int l = 0; l < index; l++) {
                    int indiceL = (int) (generatorStringTop.length() * Math.random());
                    generator.append(generatorStringTop.charAt(indiceL));
                }
                return generator.toString();
            }
        

    }
}

// co-creator reaz