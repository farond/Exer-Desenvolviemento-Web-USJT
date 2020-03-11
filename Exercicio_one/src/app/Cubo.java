package app;

public class Cubo extends Poligono3D{

    public Cubo(double base, double altura, double profundidade) {
        super(base, altura, profundidade);
    }

    public Cubo() {
        super();
    }

    @Override
    public double calcularVolume() {
        return Math.pow(this.getBase(), 3);
    }

}
