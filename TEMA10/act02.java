import java.util.ArrayList;

public class act02 {
    public static void main(String[] args) {

        int suma = 0;
        int minimo = 100;
        int maximo = 0;
        int tamano = (int) (Math.random() * 11 + 10);

        ArrayList<Integer> a = new ArrayList<Integer>();

        for (int i = 0; i < tamano; i++) {
            a.add((int) (Math.random() * 101));
        }

        System.out.println("Lista generada: " + a);

        for (int n : a) {
            suma += n;

            if (n < minimo) {
                minimo = n;
            }

            if (n > maximo) {
                maximo = n;
            }
        }

        System.out.println("La suma total es : " + suma);
        System.out.println("La media es : " + suma / tamano);
        System.out.println("El mínimo es : " + minimo);
        System.out.println("El máximo es : " + maximo);
    }
}