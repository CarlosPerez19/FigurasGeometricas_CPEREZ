public class Pentagono extends Figuras_geometricas{

    float lado;

    public Pentagono() {
    }

    public Pentagono(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    public float calcularPerimetro() {
        return lado * 5;

    }

    private static double calcularApotema (float lado) {
        return lado / (2 * Math.tan(Math.toRadians(180.0 / 5)));
    }
    public float calcularArea(){
        double area = (calcularPerimetro() * calcularApotema(lado))/2;
        return (float) area;
    }


}
