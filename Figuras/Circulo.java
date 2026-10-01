public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double CalcularArea() {
        return Math.PI * radio * radio;
    }

}