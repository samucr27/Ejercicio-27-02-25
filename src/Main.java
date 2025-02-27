import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random ale = new Random();
        Scanner teclado = new Scanner(System.in);

        int max = 50;
        int min = 1;
        int num = ale.nextInt((max - min + 1)) + min;
        int intentos = 3;
        int op;

        System.out.println("Adivina el número entre " + min + " y " + max );

        for (int i = 1; i <= intentos; i++) {
            System.out.println("Ingrese los numeros");
            op = teclado.nextInt();

            if (op > num) {
                System.out.println("El número a adivinar es menor.");
            } else if (op < num) {
                System.out.println("El número a adivinar es mayor.");
            } else {
                System.out.println("Adivino el numero :)");
                return;
            }
        }

        System.out.println("Perdiste. El número era: " + num);
    }
}
