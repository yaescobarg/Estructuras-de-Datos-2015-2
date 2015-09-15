
import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Figuras> Arr = new ArrayList<>();

        Arr.add(new Rectangulo());
        Arr.add(new Rectangulo(8, 3));
        Arr.add(new Rectangulo(4, 5));
        Arr.add(new Rectangulo(3, 9));
        Arr.add(new Rectangulo(111.11, 6));
        Arr.add(new triangulo());
        Arr.add(new triangulo(2,2,4));
        Arr.add(new triangulo(3,4,5));
        Arr.add(new triangulo(8,9,5));
        Arr.add(new triangulo(7,7,7));
        Arr.add(new circulo());
        Arr.add(new circulo(2));
        Arr.add(new circulo(20));
        Arr.add(new circulo(5));
        Arr.add(new circulo(10));
        
        ListIterator<Figuras> iterador = Arr.listIterator();
        while (iterador.hasNext()) {
            System.out.print(iterador.next() + "\n");
        }

    }
}
