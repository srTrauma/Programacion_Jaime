import java.util.ArrayList;

public class index {
    public static void main(String[] args) {
        ArrayList<bebidas> bebidas_listaArrayList = new ArrayList<>();
        bebidas Coca = new bebidas("Cocacola-company", "Cocacola", false);
        bebidas DYC = new bebidas("Segovia", "DYC", true);
        bebidas_listaArrayList.add(DYC);
        bebidas_listaArrayList.add(Coca);
        String coca = Coca.getNombre();
         String dyc = DYC.getNombre();
        // -----------------------------------------------------------------------------------------------------------------------
        ArrayList<persona> personas_lista = new ArrayList<>();
        persona Juan = new persona("Juan", 12, dyc);
        persona Mario = new persona("Mario", 17, coca);
        persona Lucas = new persona("Lucas", 16, coca);
        persona Marcos = new persona("Marcos", 12, coca);
        persona Cesar = new persona("Cesar", 12, coca);
        persona Adri = new persona("Adri", 35, dyc);
        persona Izan = new persona("Izan", 19, dyc);
        persona Sergio = new persona("Sergio", 18, dyc);
        persona Pablo = new persona("Pablo", 35, dyc);
        persona Pedro = new persona("Pedro", 35, dyc);
        personas_lista.add(Juan);
        personas_lista.add(Marcos);
        personas_lista.add(Mario);
        personas_lista.add(Lucas);
        personas_lista.add(Cesar);
        personas_lista.add(Adri);
        personas_lista.add(Izan);
        personas_lista.add(Sergio);
        personas_lista.add(Pablo);
        personas_lista.add(Pedro);

         for(persona per : personas_lista){
            String beb = per.getBebida();
            if(beb.equals(dyc) && per.getEdad()<18){
                System.out.println("No tienes edad suficiente");
            }else{
                System.out.println("Disfrute su compra");
            }
         }

    }

}
