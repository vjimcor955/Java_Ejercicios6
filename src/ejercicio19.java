import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Introduzca la base del numero que quiere convertir (bin, dec, hex, oct): ");
        String base = lectura.next().toLowerCase();
        System.out.print("Introduzca el numero: ");
        String num = lectura.next();
        System.out.print("Introduzca la base a la que quiere convertir el numero introducido (bin, dec, hex, oct): ");
        String nuevaBase = lectura.next().toLowerCase();

        int nuevoNum;
        String resultado = "";

        switch (base) {
            case "bin":
                nuevoNum = Integer.parseInt(num, 2);
                break;
            case "hex":
                nuevoNum = Integer.parseInt(num, 16);
                break;
            case "oct":
                nuevoNum = Integer.parseInt(num, 8);
                break;
            case "dec":
                nuevoNum = Integer.parseInt(num);
                break;
            default:
                System.out.println("Esa base es incorrecta.");
                return;
        }
        switch (nuevaBase) {
            case "bin":
                resultado = Integer.toBinaryString(nuevoNum);
                break;
            case "hex":
                resultado = Integer.toHexString(nuevoNum);
                break;
            case "oct":
                resultado = Integer.toOctalString(nuevoNum);
                break;
            case "dec":
                resultado = Integer.toString(nuevoNum);
                break;
            default:
                System.out.println("Esa base es incorrecta");
                return;
        }

        System.out.println("\nEl numero " + num + " en base " + nuevaBase + " es: " + resultado);
    }
}

