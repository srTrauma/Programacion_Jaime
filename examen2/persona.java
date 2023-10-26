
public class persona {
    private String nombre;
    private int edad;
    private String bebida;
    //-----------------------Getter bebida ------------------
    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    //-----------------------Getter Nombre------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // ------------------------Getter edad---------------------------------------
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    // -----------------Constructor---------------------------
    public persona(String nombreString, int edadInt, String bebidaString) {
        setEdad(edadInt);
        setNombre(nombreString);
        setBebida(bebidaString);
    }
}   
