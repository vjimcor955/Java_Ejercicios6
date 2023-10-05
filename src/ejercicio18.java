import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Introduzca un numero decimal para pasarlo a binario: ");
        int num = lectura.nextInt();

        StringBuilder binario = new StringBuilder();
        while (num > 0) {
            int resto = num % 2;
            binario.insert(0, resto);
            num = num / 2;
        }
        System.out.println("\n" + binario);
    }
}
