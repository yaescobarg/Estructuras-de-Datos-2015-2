public class Main {

    public static void main(String[] args) {
        
        Rectangulo rectdefault = new Rectangulo();
        System.out.println("Rectangulo D = " + rectdefault);
        Rectangulo rectangulo1 = new Rectangulo(5, 5);
        System.out.println("Rectangulo 1 = " + rectangulo1);
        Rectangulo rectangulo2 = new Rectangulo(4, 4);
        System.out.println("Rectangulo 2 = " + rectangulo2);
        Rectangulo rectangulo3 = new Rectangulo(3, 5);
        System.out.println("Rectangulo 3 = " + rectangulo3);
        Rectangulo rectangulo4 = new Rectangulo(5, 4);
        System.out.println("Rectangulo 4 = " + rectangulo4);
        
        triangulo triandefault = new triangulo();
        System.out.println("\nTriangulo D = " + triandefault);
        triangulo triangulo1 = new triangulo(5, 5, 3);
        System.out.println("triangulo 1 = " + triangulo1);
        triangulo triangulo2 = new triangulo(4, 4, 2);
        System.out.println("triangulo 2 = " + triangulo2);
        triangulo triangulo3 = new triangulo(3, 4, 5);
        System.out.println("triangulo 3 = " + triangulo3);
        triangulo triangulo4 = new triangulo(5, 4, 6);
        System.out.println("triangulo 4 = " + triangulo4);
        
        circulo circdefault = new circulo();
        System.out.println("\nCirculo D = " + circdefault);
        circulo circulo1 = new circulo(5);
        System.out.println("circulo 1 = " + circulo1);
        circulo circulo2 = new circulo(4);
        System.out.println("circulo 2 = " + circulo2);
        circulo circulo3 = new circulo(10);
        System.out.println("circulo 3 = " + circulo3);
        circulo circulo4 = new circulo(6);
        System.out.println("circulo 4 = " + circulo4);
    }
}
