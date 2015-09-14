/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yesid
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rectdefault = new Rectangulo();
        System.out.println("Default = " + rectdefault);
        Rectangulo rectangulo1 = new Rectangulo(5, 5);
        System.out.println("Rectangulo 1 = " + rectangulo1);
        Rectangulo rectangulo2 = new Rectangulo(4, 4);
        System.out.println("Rectangulo 2 = " + rectangulo2);
        Rectangulo rectangulo3 = new Rectangulo(3, 5);
        System.out.println("Rectangulo 3 = " + rectangulo3);
        Rectangulo rectangulo4 = new Rectangulo(5, 4);
        System.out.println("Rectangulo 4 = " + rectangulo4);
    }
}
