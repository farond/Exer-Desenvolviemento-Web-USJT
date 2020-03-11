package app;

public class Quadrado extends Poligono
        implements Diagonal {

    public Quadrado(double base, double altura) {
        super(base, altura);
    }

    public Quadrado() {
        super();
    }

    @Override
    public double calcularPerimetro() {
        return 4 * getBase();
    }

    @Override
    public double calcularDiagonal() {
        return getBase() * Math.sqrt(2);
    }

}