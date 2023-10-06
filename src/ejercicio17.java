import static java.lang.Integer.parseInt;

public class ejercicio17 {
    public static void main(String[] args) {
        System.out.println(binarioADecimal("110100100101000101"));
    }
    static int binarioADecimal(String numero) {
        String[] numeroSplit = numero.split("");
        int decimal = 0;
        for (int posicion = 0; posicion < numeroSplit.length; posicion++) {
            if (parseInt(numeroSplit[posicion]) == 1 && Math.abs(posicion-numeroSplit.length) > 1) {
                decimal += Math.pow(parseInt(numeroSplit[posicion])+1,Math.abs(posicion-numeroSplit.length)-1);
            }
            else if (parseInt(numeroSplit[posicion]) == 1) {
                decimal += 1;
            }
        }
        return decimal;
    }
}
