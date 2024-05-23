public class Figuras_geometricas {

    String nombre;
    int num_lados;
    boolean reguladridad;

    public Figuras_geometricas() {
    }

    public Figuras_geometricas(String nombre, int num_lados, boolean reguladridad) {
        this.nombre = nombre;
        this.num_lados = num_lados;
        this.reguladridad = reguladridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_lados() {
        return num_lados;
    }

    public void setNum_lados(int num_lados) {
        this.num_lados = num_lados;
    }

    public boolean getReguladridad() {
        return reguladridad;
    }

    public void setReguladridad(boolean reguladridad) {
        this.reguladridad = reguladridad;
    }
}
