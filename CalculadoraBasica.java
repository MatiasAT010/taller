import java.util.Scanner;

public class CalculadoraBasica {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return 0;
        }
        return (double)a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        // Realizar operaciones
        System.out.println("Suma: " + sumar(num1, num2));
        System.out.println("Resta: " + restar(num1, num2));
        System.out.println("Multiplicación: " + multiplicar(num1, num2));
        System.out.println("División: " + dividir(num1, num2));

        // Comparar los números usando operadores lógicos y de comparación
        if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else if (num1 < num2) {
            System.out.println("El segundo número es mayor que el primero.");
        } else {
            System.out.println("Ambos números son iguales.");
        }
        scanner.close();
    }
}
