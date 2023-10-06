import java.util.Arrays;
import java.util.Random;

public class ejercicio29_34 {
    public static int[][] generaArrayBiInt(int filas, int columnas, int numMinimo, int numMaximo) {
        int[][] array = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = random.nextInt((numMaximo - numMinimo) + 1);
            }
        }

        return array;
    }
    public static int[] filaDeArrayBiInt(int[][] array, int fila) {
        return array[fila-1];
    }
    public static int[] columnaDeArrayBiInt(int[][] array, int columna) {
        int filas = array.length;
        int[] columnaArray = new int[filas];

        for (int i = 0; i < filas; i++) {
            columnaArray[i] = array[i][columna-1];
        }

        return columnaArray;
    }
    public static int[] coordenadasEnArrayBiInt(int[][] array, int numero) {
        int[] posicion = {-1, -1};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == numero) {
                    posicion[0] = i+1;
                    posicion[1] = j+1;
                    return posicion;
                }
            }
        }

        return posicion;
    }
    public static String esPuntoDeSilla(int[][] array, int fila, int columna) {
        int nuevaFila = fila - 1;
        int nuevaColumna = columna - 1;
        int valor = array[nuevaFila][nuevaColumna];

        for (int j = 0; j < array[fila].length; j++) {
            if (array[nuevaFila][j] < valor && j != nuevaColumna) {
                return "El " + valor + " no es el menor de su fila";
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i][nuevaColumna] > valor && i != nuevaFila) {
                return "El " + valor + " no es el mayor de su columna";
            }
        }

        return "El " + valor + " es tanto el menor de su fila como el mayor de su columna";
    }
    public static int[] diagonal(int[][] array, int fila, int columna, String direccion) {
        int filas = array.length;
        int columnas = array[0].length;
        int[] diagonalArray;
        int nuevaFila = fila - 1;
        int nuevaColumna = columna - 1;

        if (direccion.equals("nose")) {
            int minDimension = Math.min(filas - nuevaFila, columnas - nuevaColumna);
            diagonalArray = new int[minDimension];

            for (int i = 0; i < minDimension; i++) {
                diagonalArray[i] = array[nuevaFila + i][nuevaColumna + i];
            }
        } else if (direccion.equals("neso")) {
            int minDimension = Math.min(filas - nuevaFila, columnas - nuevaColumna);
            diagonalArray = new int[minDimension];

            for (int i = 0; i < minDimension; i++) {
                diagonalArray[i] = array[nuevaFila + i][nuevaColumna - i];
            }
        } else {
            diagonalArray = new int[0];
        }

        return diagonalArray;
    }
    public static void main(String[] args) {
        int[][] array = generaArrayBiInt(5, 5, 1, 100);

        System.out.println("29. Array bidimensional generado: \n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n30. Fila 3: " + Arrays.toString(filaDeArrayBiInt(array, 3)));
        System.out.println("31. Columna 4: " + Arrays.toString(columnaDeArrayBiInt(array, 4)));
        System.out.println("32. Coordenadas del numero 33: " + Arrays.toString(coordenadasEnArrayBiInt(array, 33)));
        System.out.println("33. El numero de la fila 3 y la columna 3 es punto de silla: " + esPuntoDeSilla(array, 3, 3));
        System.out.println("34. Diagonal \"nose\" del numero en la posicion [1, 2]: " + Arrays.toString(diagonal(array, 1, 2, "nose")));
    }
}
