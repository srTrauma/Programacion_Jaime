package test_input;

import java.util.Scanner;
class input {
    public static String[] userInput() {

        String[] userSting = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte palabras para poner en el array, delimitados por coma y sin espacio entre ellos");
        String userImput = scanner.nextLine();
        userSting = userImput.split(",");
        System.out.println("----------------La lista----------------");

        return userSting;
    }
}