import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class ejercicio16 {
    public static void main(String[] args) {
        System.out.println(capicuas10000());
    }

    static ArrayList<Integer> capicuas10000() {
        ArrayList<Integer> capicuas = new ArrayList<>();
        for (int numero = 1; numero < 100000; numero++) {
            String numeroReverso = "";
            String[] numeroSplit = String.valueOf(numero).split("");
            for (int index = numeroSplit.length - 1; index >= 0; index--) {
                numeroReverso += numeroSplit[index];
            }
            if (parseInt(numeroReverso) == numero) {
                capicuas.add(numero);
            }
        }
        return capicuas;
    }
}
