public class triangulo implements Figuras{
    
    private double lado1;
    private double lado2;
    private double lado3;

    public triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        if (lado1+lado2<lado3 || lado1+lado3<lado2 || lado2+lado3<lado1) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    public static double perimetro(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    public static double semiperimetro(double lado1, double lado2, double lado3) {
        return perimetro(lado1, lado2, lado3) / 2;
    }

    public static double area(double lado1, double lado2, double lado3) {
        double s = semiperimetro(lado1, lado2, lado3);
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

        triangulo() {
        lado1 = 1;
        lado2 = 1;
        lado3 = 1;
        }
    
    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

 
    public double getLado1() {
        return lado1;
    }

    public void setBase(double base) {
        this.lado1 = lado1;
    }

    @Override
    public double getArea() {
        return area(this.lado1, this.lado2, this.lado3);
    }

    @Override
    public double getPerimetro() {
        return perimetro(this.lado1, this.lado2, this.lado3);
    }

    @Override
    public String toString() {
        return '{' + "Area = " + getArea() + ", Perímetro = " + getPerimetro() + '}';
    }

}
