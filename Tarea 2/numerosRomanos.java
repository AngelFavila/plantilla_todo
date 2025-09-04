import java.util.InputMismatchException;
import java.util.Scanner;

public class numerosRomanos {

    public static String convert(int numero) {
        int[] naturales = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String resultado = "";

        for (int i = 0; i < naturales.length; i++) {
            while (numero >= naturales[i]) {
                numero -= naturales[i];
                resultado += simbolos[i];
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("****Convertidor de Numeros a Romanos****");

        while (continuar) {
            try {
                System.out.print("\nIngresa un numero: ");
                int numero = sc.nextInt();

                if (numero < 1 || numero > 3999) {
                    System.out.println("Error!!! Solo se aceptan numeros del 1 al 3999.");
                } else {
                    String numeroRomano = convert(numero);
                    System.out.println("Numero romano: " + numeroRomano);
                }

                System.out.print("\nQuieres intentar con otro numero? (y/n): ");
                String respuesta = sc.next().trim();
                if (respuesta.equalsIgnoreCase("y")) {
                    continuar = true;
                }else {
                    continuar = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("Por favor ingresa solo numeros.");
                sc.nextLine();
            }
        }
        System.out.println("\nAdios");
        sc.close();
    }
}
