import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ejercicio1_14 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Introduzca numero");
        Integer numeroIntroducido = userInput.nextInt();
        Integer numeroIntroducido2 = userInput.nextInt();
        Integer numeroIntroducido3 = userInput.nextInt();
        System.out.println(pegaNumeros(numeroIntroducido, numeroIntroducido2));
        //El main lo he usado para testear las funciones
    }

    static boolean esCapicua(Integer numero) {
        String [] numeroSplit = String.valueOf(numero).split("");
        String numeroReverso = "";
        for (int cont = numeroSplit.length-1; cont >= 0; cont -- ) {
            numeroReverso += numeroSplit[cont];
        }
        return String.valueOf(numero).equals(numeroReverso);
    }
    static boolean esPrimo(Integer numero) {
        for (int cont = 2; cont < numero; cont++) {
            if (numero % cont == 0) {
                return false;
            }
        }
        return true;
    }
    static int siguientePrimo(Integer numero) {
        int numeroPrimo = numero+1;
        boolean continueLoop = true;
        while (continueLoop) {
            continueLoop = false;
            numeroPrimo = numeroPrimo+1;
            for (int divisor = 2; divisor < numeroPrimo; divisor++) {
                if (numeroPrimo % divisor == 0) {
                    continueLoop = true;
                }
            }
        }
        return (numeroPrimo);
    }
    static int potencia(Integer numero) {
        return numero*numero;
    }
    static int digitos(Integer numero) {
        return String.valueOf(numero).length();
    }
    static int voltea(Integer numero) {
        String [] numeroSplit = String.valueOf(numero).split("");
        String numeroReverso = "";
        for (int cont = numeroSplit.length-1; cont >= 0; cont -- ) {
            numeroReverso += numeroSplit[cont];
        }
        return parseInt(numeroReverso);
    }
    static int digitoN(Integer numero, Integer posicion) {
        String [] numeroSplit = String.valueOf(numero).split("");
        return parseInt(numeroSplit[posicion-1]);
    }
    static int quitaPorDetras(Integer numero, Integer cantidadAQuitar) {
        String [] numeroSplit = String.valueOf(numero).split("");
        String numeroResultante = "";
        for (int cont = 0; cont < numeroSplit.length-cantidadAQuitar; cont++) {
            numeroResultante += numeroSplit[cont];
        }
        return parseInt(numeroResultante);
    }
    static int quitaPorDelante(Integer numero, Integer cantidadAQuitar) {
        String [] numeroSplit = String.valueOf(numero).split("");
        String numeroResultante = "";
        for (int cont = cantidadAQuitar; cont < numeroSplit.length; cont++) {
            numeroResultante += numeroSplit[cont];
        }
        return parseInt(numeroResultante);
    }
    static int pegaPorDetras(Integer numero, Integer numeroAIntroducir) {
        return parseInt(String.valueOf(numero)+String.valueOf(numeroAIntroducir));
    }
    static int pegaPorDelante(Integer numero, Integer numeroAIntroducir) {
        return parseInt(String.valueOf(numeroAIntroducir)+String.valueOf(numero));
    }
    static int trozoDeNumero(Integer numero, Integer posicionInicial, Integer posicionFinal) {
        String [] numeroSplit = String.valueOf(numero).split("");
        String numeroResultante = "";
        for (int cont = posicionInicial-1; cont < posicionFinal; cont++) {
            numeroResultante += numeroSplit[cont];
        }
        return parseInt(numeroResultante);
    }
    static int pegaNumeros(Integer numero, Integer numeroAIntroducir) {
        return parseInt(String.valueOf(numeroAIntroducir)+String.valueOf(numero));
    }
}