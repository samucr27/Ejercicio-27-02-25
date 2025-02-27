import java.util.Random;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        int contdado1 = 0;
        int contdado2 = 0;
        Random ale = new Random();
        int rondas = ale.nextInt(max - min + 1) + min;
        System.out.println("Cantidad de rondas: " + rondas);

        for(int i = 1; i <= rondas; ++i) {
            int dado1 = ale.nextInt(6) + 1;
            contdado1 += dado1;
            int dado2 = ale.nextInt(6) + 1;
            contdado2 += dado2;
            System.out.println();
            System.out.println("Dado1:" + dado1);
            System.out.println("Dado2:" + dado2);
            System.out.println();
        }

        System.out.println("Contador1: " + contdado1);
        System.out.println("Contador2: " + contdado2);
        System.out.println();
        System.out.println("Suma Dado1: " + contdado1);
        System.out.println("Suma Dado2: " + contdado2);
        if (contdado1 > contdado2) {
            System.out.println("La suma del dado 1 es mayor");
        } else {
            System.out.println("La suma del dado 2 es mayor");
        }

    }
}
