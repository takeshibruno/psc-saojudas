package pratica_6.parte2.exercicio2;

public class Esfera extends Figura3D {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio; // Opcionalmente, pode ser omitido para a esfera
    }

    @Override
    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * raio * raio * raio;
    }
}
