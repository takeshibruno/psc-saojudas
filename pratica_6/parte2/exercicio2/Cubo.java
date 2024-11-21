package pratica_6.parte2.exercicio2;

public class Cubo extends Figura3D {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 12 * lado;
    }

    @Override
    public double calcularVolume() {
        return lado * lado * lado;
    }
}

