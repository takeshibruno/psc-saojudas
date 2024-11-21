package pratica_6.parte2.exercicio2;

public class Losango extends Quadrilatero {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    @Override
    public double calcularPerimetro() {
        double lado = Math.sqrt((diagonalMaior / 2) * (diagonalMaior / 2) + (diagonalMenor / 2) * (diagonalMenor / 2));
        return 4 * lado;
    }
}
