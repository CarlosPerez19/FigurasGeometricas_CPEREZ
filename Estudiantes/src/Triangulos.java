public class Triangulos extends Figuras_geometricas{

    float base;
    float altura;

    public Triangulos() {
    }

    public Triangulos(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() { return base; }

    public void setBase(float base) { this.base = base; }

    public float getAltura() { return altura; }

    public void setAltura(float altura) { this.altura = altura;}

    public float calcularArea(){
        float area = base*altura;
        return area;
    }
}
