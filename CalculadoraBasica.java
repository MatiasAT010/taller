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
        //Preguntarle al usuario que quiere hacer
        System.out.println("¿Que operacion matematica quieres hacer?");
        System.out.println("");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Comparacion");
        int opcion = scanner.nextInt();
        
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        // Realizar operaciones segun lo que el usuario haya escogido
        switch (opcion) {
            case 1: int sumar;
              System.out.println("El resultado de tu suma es: " + sumar(num1, num2));
              break;
            case 2: int restar;
              System.out.println("El resultado de tu resta es: " + restar(num1, num2));
              break;
            case 3: int multiplicar;
             System.out.println("El resultado de tu multiplicación es: " + multiplicar(num1, num2));
             break;
            case 4: int dividir;
             System.out.println("El resultado de tu división es: " + dividir(num1, num2));
             break;
             // Comparar los números usando operadores lógicos y de comparación
             case 5:  if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else if (num1 < num2) {
            System.out.println("El segundo número es mayor que el primero.");
        } else {
            System.out.println("Ambos números son iguales.");
        }
            
        }
       scanner.close();
    }
}
