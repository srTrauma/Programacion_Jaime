import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
    
    public static String Name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("Ingrese su nombre:\n");
        String nombrePerSc = scanner.next();
        
        return nombrePerSc;
    }

    public static ArrayList<String> comprar() {
        
        Scanner scannerComprar = new Scanner(System.in);
        ArrayList<String> botellaLista = new ArrayList<String>();
        ArrayList<String> Fanta = Bebida.setBebida("CocaCola_Company", "Fanta", false);
        ArrayList<String> Fanta_limon = Bebida.setBebida("CocaCola_Company", "Fanta_limon", false);
        ArrayList<String> Cocacola = Bebida.setBebida("CocaCola_Company", "Cocacola", false);
        ArrayList<String> Stripte = Bebida.setBebida("CocaCola_Company", "Stripte", false);
        ArrayList<String> Bifrutas = Bebida.setBebida("CocaCola_Company", "Bifrutas", false);
        ArrayList<String> Dyc = Bebida.setBebida("Dyc", "Dyc", true);
        ArrayList<String> Jameson = Bebida.setBebida("Jameson", "Jameson", true);
        ArrayList<String> Gran_capitan = Bebida.setBebida("Gran_capitan", "Gran_capitan", true);
        ArrayList<String> Valentinos = Bebida.setBebida("Valentinos", "Valentinos", true);
        ArrayList<String> Absolute_vodka = Bebida.setBebida("Absolute_vodka", "Absolute_vodka", true);

       
        System.out.println("------------------------------");
        System.out.println("Ingresa tu edad:\n");
        int edadPersona = scannerComprar.nextInt();
        System.out.println("Ok " + Name() + "\nTiene " + edadPersona
                + "\nPuede elegir entre las siguientes opciones de bebidas:\n");
        if (edadPersona < 18) {
            System.out.println("1.Fanta\n" + "2.Fanta Limon\n" + "3.Cocacola\n" + "4.Stripte\n" + "5.Bifrutas");
        } else {
            System.out.println("1.Fanta\n" + "2.Fanta Limon\n" + "3.Cocacola\n" + "4.Stripte\n"
                    + "5.Bifrutas\n6.Dyc\n7.Jameson\n8.Gran capitan \n9.Valentinos\n10.Absolute vodka");
        }
        System.out.println("Seleccione que bebida va a lleva");
        int botellaSelc = scannerComprar.nextInt();
        switch (botellaSelc) {
            case 1:
                System.out.println(Fanta);
                botellaLista = Fanta;
                break;
            case 2:
                System.out.println(Fanta_limon);
                botellaLista = Fanta_limon;
                break;
            case 3:
                System.out.println(Cocacola);
                botellaLista = Cocacola;
                break;
            case 4:
                System.out.println(Stripte);
                botellaLista = Stripte;
                break;
            case 5:
                System.out.println(Bifrutas);
                botellaLista = Bifrutas;
                break;
            case 6:
                if (edadPersona >= 18) {
                    System.out.println(Dyc);
                    botellaLista = Dyc;
                } else {
                    System.out.println("No tienes edad suficiente");
                    botellaLista = null;
                }
                break;
            case 7:
                if (edadPersona >= 18) {
                    System.out.println(Jameson);
                    botellaLista = Jameson;
                } else {
                    System.out.println("No tienes edad suficiente");
                    botellaLista = null;
                }
                break;
            case 8:
                if (edadPersona >= 18) {
                    System.out.println(Gran_capitan);
                    botellaLista = Gran_capitan;
                } else {
                    System.out.println("No tienes edad suficiente");
                    botellaLista = null;
                }
                break;
            case 9:
                if (edadPersona >= 18) {
                    System.out.println(Valentinos);
                    botellaLista = Valentinos;
                } else {
                    System.out.println("No tienes edad suficiente");
                    botellaLista = null;
                }
                break;
            case 10:
                if (edadPersona >= 18) {
                    System.out.println(Absolute_vodka);
                    botellaLista = Absolute_vodka;
                } else {
                    System.out.println("No tienes edad suficiente");
                    botellaLista = null;
                }
                break;
            default:
                System.out.println("No es una opcion");
                botellaLista = null;
                break;
        }
        
  return botellaLista;
    }

}
