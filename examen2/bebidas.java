
public class bebidas {
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String marca;
// ----------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String nombre;
// ----------------------------------------------------------------------
    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public boolean alcohol;
// ----------------------------------------------------------------------
    public bebidas(String marcaString, String nombreString, boolean alcoholBool) {
        setAlcohol(alcoholBool);
        setMarca(marcaString);
        setNombre(nombreString);
    }
}
