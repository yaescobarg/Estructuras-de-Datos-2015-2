
public class circulo implements Figuras {

    private double radio;

    public circulo(double radio) {
        this.radio = radio;
        if (radio <= 0) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    public static double area(double a) {
        return a * a * Math.PI;
    }

    public static double perimetro(double a) {
        return Math.PI * 2 * a;
    }

    circulo() {
        radio = 1;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return area(radio);
    }

    @Override
    public double getPerimetro() {
        return perimetro(radio);
    }

    @Override
    public String toString() {
        return '{' + "Area: " + getArea() + ", Perimetro: " + getPerimetro() + '}';
    }
}
