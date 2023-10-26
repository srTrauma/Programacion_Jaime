package todolist;

import java.util.ArrayList;

public class agenda {
    private ArrayList<contacto> contactos;

    public ArrayList<contacto> getContactos() {
        return contactos;
    }
     public void getContactosName() {
        for(int i = 0; i<contactos.size();i++){
            int nº = i+1;
            System.out.println("contacto " + Integer.toString(nº) + ": " + contactos.get(i).getDescripcion());
        }
       
    }
    public agenda() {
        contactos = new ArrayList<>();
    }

    public void agregarcontacto(contacto contacto) {
        contactos.add(contacto);
    }

    public void mostrarcontactos() {
        String telefono;
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos en la lista.");
        } else {

            for (int i = 0; i < contactos.size(); i++) {
                if (contactos.get(i).getTelInteger() == null) {
                    telefono = contactos.get(i).getTelIntegerStr();
                } else {
                    telefono = contactos.get(i).getTelInteger().toString();
                }
                try {
                    int tel = Integer.parseInt(telefono);
                    System.out.println("contacto " + Integer.toString(i) + ": " + contactos.get(i).getDescripcion());
                    System.out.println("numero de tel " + Integer.toString(i) + ": " + tel);
                    System.out.println("Gmail " + Integer.toString(i) + ": " + contactos.get(i).getGmailString());
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("\n");
                } catch (NumberFormatException e) {
                    System.out.println("contacto " + Integer.toString(i) + ": " + contactos.get(i).getDescripcion());
                    System.out.println("numero de tel " + Integer.toString(i) + ": " + "No ha insertado un nº");
                    System.out.println("Gmail " + Integer.toString(i) + ": " + contactos.get(i).getGmailString());
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("\n");
                }
    

            }
        }
    }
    public void mostrar_un_contacto(int i){
        if(i <0 || i>contactos.size()){
            System.out.println("error vuelva a probar");
        }else{
            i--;
        String telefono;
        for (int z = 0; z < contactos.size(); z++) {
            if (contactos.get(i).getTelInteger() == null) {
                    telefono = contactos.get(i).getTelIntegerStr();
                } else {
                    telefono = contactos.get(i).getTelInteger().toString();
                }
                try {
                    int tel = Integer.parseInt(telefono);
                    System.out.println("contacto " + Integer.toString(i) + ": " + contactos.get(i).getDescripcion());
                    System.out.println("numero de tel " + Integer.toString(i) + ": " + tel);
                    System.out.println("Gmail " + Integer.toString(i) + ": " + contactos.get(i).getGmailString());
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("\n");
                } catch (NumberFormatException e) {
                    System.out.println("contacto " + Integer.toString(i) + ": " + contactos.get(i).getDescripcion());
                    System.out.println("numero de tel " + Integer.toString(i) + ": " + "No ha insertado un nº");
                    System.out.println("Gmail " + Integer.toString(i) + ": " + contactos.get(i).getGmailString());
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("\n");
                }
        }
    }
}
}