package pratica_6.parte2.exercicio2;

public class execute {
    public static void main(String[] args) {
        Figura2D quadrado = new Quadrado(5);
        Figura3D cubo = new Cubo(3);
        Figura3D esfera = new Esfera(4);

        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do Quadrado: " + quadrado.calcularPerimetro());

        System.out.println("Área do Cubo: " + cubo.calcularArea());
        System.out.println("Volume do Cubo: " + cubo.calcularVolume());

        System.out.println("Área da Esfera: " + esfera.calcularArea());
        System.out.println("Volume da Esfera: " + esfera.calcularVolume());
    }
}
