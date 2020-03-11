package app;

public class Retangulo extends Poligono
        implements Diagonal {

    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    public Retangulo() {
        super();
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }

    @Override
    public double calcularPerimetro() {
        return 2 * getBase() + 2 * getAltura();
    }

    @Override
    public double calcularDiagonal() {
        return Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
    }

}