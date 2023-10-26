import java.util.ArrayList;
import java.util.Scanner;


public class index {
    public static void main(String[] args) {
        System.out.println("Bienbenido a supermercado Pepito:\n ");
        ArrayList<String> pepito = Persona.comprar();
        System.out.println("Escriba si para confirmar el pedido");
        Scanner scannerCofirmar = new Scanner(System.in);
        String confirm = scannerCofirmar.nextLine();
        if(confirm.equalsIgnoreCase("Si")){
            System.out.println("Se lleva" + pepito);
        }else{
            System.out.println("Cancelado");
        }

    }
}
