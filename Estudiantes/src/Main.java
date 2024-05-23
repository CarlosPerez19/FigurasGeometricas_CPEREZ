import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        System.out.println("CAMBIOS");
        Scanner sc = new Scanner(System.in);

        Figuras_geometricas miFiguras = new Figuras_geometricas();
        Circulos miCirculos = new Circulos();
        Triangulos miTriangulos = new Triangulos();
        Cuadtrilateros miCuadtrilateros = new Cuadtrilateros();

        Circulos miCirculos2 = new Circulos(4.8);
        Triangulos miTriangulo2 = new Triangulos(9, 5);
        Cuadtrilateros miCudrilatero2 = new Cuadtrilateros(6.3, 5.3);
        Cuadtrilateros miCuadrilatero3 = new Cuadtrilateros(6.5, 5.2);

        miCirculos.setNombre("CIRCULIN");
        System.out.println(miCirculos.getNombre());

        System.out.println("La pileta tendra un radio de: ");
        miCirculos.setRadio(5.68);
        System.out.println(miCirculos.getRadio());

        System.out.println("La pileta tendra un area de: ");
        System.out.println(miCirculos.calcularArea());

        miTriangulos.setNombre("TRIANGULIN");
        System.out.println(miTriangulos.getNombre());

        System.out.println("El tringualo tiene area de: ");
        miTriangulos.setAltura(9);
        miTriangulos.setBase(8);

        System.out.println (miTriangulos.calcularArea());

        miCuadtrilateros.setNombre("RECTANGULIN");
        System.out.println(miCuadtrilateros.getNombre());

        miCuadtrilateros.setAncho(8.8);
        miCuadtrilateros.setLargo(9.9);

        System.out.println("El tringualo tiene area de: ");
        System.out.println(miCuadtrilateros.calcularArea());

        miCirculos2.setNombre("CIRCULIN2");
        System.out.println(miCirculos2.getNombre());

        System.out.println("El Circulo tiene un radio de: ");
        System.out.println(miCirculos2.calcularArea());

        System.out.println("El Circulo tiene area de: ");
        System.out.println(miCirculos2.calcularArea());

        miTriangulo2.setNombre("TRIANGULIN2");
        System.out.println(miTriangulo2.getNombre());

        System.out.println("El tringualo tiene area de: ");
        System.out.println(miTriangulo2.calcularArea());

        miCuadrilatero3.setNombre("RECTANGULIN3");
        System.out.println(miCuadrilatero3.getNombre());

        System.out.println("El Rectangulo tiene area de: ");
        System.out.println(miCuadrilatero3.calcularArea());

        miCudrilatero2.setNombre("RECTANGULIN2");
        System.out.println(miCudrilatero2.getNombre());

        System.out.println("El Rectangulo tiene area de: ");
        System.out.println(miCudrilatero2.calcularArea());


        Pentagono miPentagono = new Pentagono();
        miPentagono.setNombre("PENTAGONO");
        System.out.println(miPentagono.getNombre());

        miPentagono.setLado(9);
        System.out.println(miPentagono.calcularPerimetro());
        System.out.println(miPentagono.calcularArea());

        Hexagono miHexagono = new Hexagono();
        miHexagono.setNombre("Prueba");
        System.out.println(miHexagono.getNombre());

        miHexagono.setLado(65);
        System.out.println(miHexagono.calcularPerimetro());
        System.out.println(miHexagono.calcularArea());

    }
}
