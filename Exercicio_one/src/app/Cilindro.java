package app;

public class Cilindro extends Poligono3D {

    private double raio;

    public Cilindro(double base, double altura, double profundidade, double raio) {
        super(base, altura, profundidade);
        this.raio = raio;
    }

    public Cilindro() {
        super();
        this.raio = 0;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularVolume() {
        return Math.PI * Math.sqrt(raio) * getAltura();
    }
}
