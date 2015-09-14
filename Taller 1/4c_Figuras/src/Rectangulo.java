/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yesid
 */
public class Rectangulo  implements Figuras{

    private double ancho;
    private double largo;

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
        if (ancho<=0 || largo<=0 ){
        throw new UnsupportedOperationException("Not supported yet."); 
        }
    }

    public static double area(double b, double a) {
        return b * a;
    }

    public static double perimetro(double l1, double l2) {
        return 2 * (l1 + l2);
    }

    Rectangulo() {
        ancho = 1;
        largo = 1;
        }

    public double getArea() {
        return area(this.ancho, this.largo);
    }

    public double getPerimetro() {
        return perimetro(this.ancho, this.largo);
    }

    public double getAncho() {
        return ancho;
    }
   
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return '{' + "ancho=" + ancho + ", largo=" + largo + ", perímetro= " + getPerimetro() + ", area=  " + getArea() + '}';
    }

}
