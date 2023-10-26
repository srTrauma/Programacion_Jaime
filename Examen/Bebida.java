import java.util.ArrayList;

public class Bebida {
    public Bebida(){
        
    }
        
    public static ArrayList<String>setBebida(String marca, String nombre, boolean alcohol){
ArrayList<String> bebidArrayList = new ArrayList<String>();
        bebidArrayList.add(nombre);
        bebidArrayList.add(marca);
        if(alcohol == true){
            bebidArrayList.add("LLeva alcohol");
        }else{
            bebidArrayList.add("No lleva alcohol");
        }
        return bebidArrayList;
    }
    
    }

