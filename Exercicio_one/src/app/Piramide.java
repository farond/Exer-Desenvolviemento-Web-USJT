package app;

public class Piramide extends Poligono3D {

    public Piramide(double base, double altura, double profundidade) {
        super(base, altura, profundidade);
    }

    public Piramide() {
        super();
    }

    @Override
    public double calcularVolume() {
        return ((this.getBase() * this.getAltura()) * this.getProfundidade()) / 3;
    }
}
