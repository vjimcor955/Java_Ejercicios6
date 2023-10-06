import java.util.Arrays;
import java.util.Random;

public class ejercicio20_28 {
    public static int[] generaArrayInt(int tamano, int numMinimo, int numMaximo) {
        int[] array = new int[tamano];
        Random random = new Random();

        for (int i = 0; i < tamano; i++) {
            array[i] = random.nextInt((numMaximo - numMinimo) + 1);
        }

        return array;
    }
    public static int minimoArrayInt(int[] array) {
        int numMinimo = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < numMinimo) {
                numMinimo = array[i];
            }
        }

        return numMinimo;
    }
    public static int maximoArrayInt(int[] array) {
        int numMaximo = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > numMaximo) {
                numMaximo = array[i];
            }
        }

        return numMaximo;
    }
    public static double mediaArrayInt(int[] array) {
        int suma = 0;

        for (int num : array) {
            suma += num;
        }

        return (double) suma / array.length;
    }
    public static boolean estaEnArrayInt(int[] array, int numero) {
        for (int num : array) {
            if (num == numero) {
                return true;
            }
        }

        return false;
    }
    public static String posicionEnArray(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return String.valueOf(i);
            }
        }

        return "El array no contiene el numero " + numero;
    }
    public static int[] volteaArrayInt(int[] array) {
        int principio = 0;
        int fin = array.length - 1;

        while (principio < fin) {
            int posicion = array[principio];
            array[principio] = array[fin];
            array[fin] = posicion;

            principio++;
            fin--;
        }

        return array;
    }
    public static int[] rotaDerechaArrayInt(int[] array, int posiciones) {
        int[] nuevoArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int nuevaPosicion = (i + posiciones) % array.length;
            nuevoArray[nuevaPosicion] = array[i];
        }
        System.arraycopy(nuevoArray, 0, array, 0, array.length);

        return array;
    }
    public static int[] rotaIzquierdaArrayInt(int[] array, int posiciones) {
        int[] nuevoArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int newPos = (i - posiciones + array.length) % array.length;
            nuevoArray[newPos] = array[i];
        }
        System.arraycopy(nuevoArray, 0, array, 0, array.length);

        return array;
    }
    public static void main(String[] args) {
        int[] array = generaArrayInt(10, 1, 100);
        System.out.println("\n20. Array generado: " + Arrays.toString(array));
        System.out.println("21. Numero minimo: " + minimoArrayInt(array));
        System.out.println("22. Numero maximo: " + maximoArrayInt(array));
        System.out.println("23. Media: " + mediaArrayInt(array));
        System.out.println("24. El array contiene el numero 33: " + estaEnArrayInt(array, 33));
        System.out.println("25. La posicion del numero 33 en el array: " + posicionEnArray(array, 33));
        System.out.println("26. Array volteado: " + Arrays.toString(volteaArrayInt(array)));
        System.out.println("27. Array rotado 3 posiciones a la derecha: " + Arrays.toString(rotaDerechaArrayInt(array, 3)));
        System.out.println("28. Array rotado 3 posiciones a la izquierda: "+ Arrays.toString(rotaIzquierdaArrayInt(array, 3)));
    }
}