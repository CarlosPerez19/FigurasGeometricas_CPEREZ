public class Hexagono extends Figuras_geometricas{
    String nombre;
    float lado;

    public Hexagono() {
    }

    public Hexagono(float lado, String nombre) {
        this.lado = lado;
        this.nombre = nombre;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float calcularPerimetro () {
        return lado * 6;


    }

    private static double calcularApotema (float lado) {
        return lado * Math.sqrt(3) / 2;
    }
    public float calcularArea() {
        double apotema = calcularApotema(lado);
        double area = (calcularPerimetro() * apotema ) / 2;
        return (float) area;
    }
}
