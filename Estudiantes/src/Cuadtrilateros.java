public class Cuadtrilateros extends  Figuras_geometricas {

    double largo;
    double ancho;

    public Cuadtrilateros() {
    }

    public Cuadtrilateros (double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea() {
        return largo * ancho;
    }

}
