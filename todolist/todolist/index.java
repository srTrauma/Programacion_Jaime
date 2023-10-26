package com.mycompany.mavenproject1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
       
        agenda miLista = new agenda();

        while (true) {
            System.out.println("1. Agregar un contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Mostrar 1 contacto a elgir");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            try {
                 Scanner scanner = new Scanner(System.in);
                int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la persona: ");
                    String nombrePersonaString = scanner.nextLine();
                    System.out.println("Inserte el nº de telefono de la pesona anterior, debe ser un numero: ");
                    String tInteger = scanner.next();
                    if(tInteger.length() == 9 && tInteger.startsWith("6")){

                    }else{
                        System.out.println("los telefonos españoles tiene 9 digitos y empiezan por 6");
                        break;
                    }
                    System.out.println(
                            "Inserte el correo de la pesona anterior");
                    String gString = scanner.next();
                    if (gString.contains("@") && gString.contains(".") && gString.length() >= 4) {

                    } else {
                        System.out.println(
                                "El correo introducido no es una direccion de correo valida");
                        break;
                    }
                    ;

                    contacto nuevoContacto = new contacto(nombrePersonaString, tInteger, gString);

                    miLista.agregarcontacto(nuevoContacto);
                    System.out.println("-----------------------------------------");
                    break;
                case 2:
                    System.out.println("Mostrando una lista de sus contactos");
                    System.out.println("----------------------------------------------");
                    miLista.mostrarcontactos();

                    break;
                case 3:
                
                    System.out.println("hay "+ miLista.getContactos().size() + " contactos");
                    miLista.getContactosName();
                    System.out.println("Eliga un nº para verlo");
                    System.out.println("----------------------------------------------");
                    try {
                        int index = scanner.nextInt();
                    if(index != 0){
                        miLista.mostrar_un_contacto(index);
                        
                    }else{
                        break;
                    }
                    } catch (InputMismatchException e) {
                        System.out.println("eso no es un numero, pruebe otra vez");
                        break;
                        
                    }
                    
                    
                    break;
                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            } catch (Exception e) {
                System.out.println("----------------------------");
                System.out.println("Eso no es una opcion valida");
                System.out.println("----------------------------");
            }
            
        }

    }
}