import java.util.ArrayList;

public class ejercicio15 {
    public static void main(String[] args) {
        System.out.println(primos1000());
    }
    static ArrayList<Integer> primos1000() {
        ArrayList<Integer> primos = new ArrayList<>();
        boolean esPrimo = true;
        for (int numero = 3; numero <= 1000; numero++) {
            for (int divisor = 2; divisor < numero; divisor++) {
                esPrimo = true;
                if (numero % divisor == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos.add(numero);
            }
        }
        return primos;
    }
}
