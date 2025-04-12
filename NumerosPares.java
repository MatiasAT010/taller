import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números a evaluar: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("El número " + i + " es par.");
            } else {
                System.out.println("El número " + i + " es impar.");
            }
        }
        scanner.close();
    }
}
