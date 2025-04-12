import java.util.Scanner;

public class MenuCalculadora {

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            // Mostrar menú
            System.out.println("\n--- Menú Calculadora ---");
            System.out.println("1. Calcular el área de un rectángulo");
            System.out.println("2. Calcular el área de un círculo");
            System.out.println("3. Calcular el área de un triángulo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la base del rectángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingresa la altura del rectángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("El área del rectángulo es: " + calcularAreaRectangulo(base, altura));
                    break;
                case 2:
                    System.out.print("Ingresa el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("El área del círculo es: " + calcularAreaCirculo(radio));
                    break;
                case 3:
                    System.out.print("Ingresa la base del triángulo: ");
                    double baseTri = scanner.nextDouble();
                    System.out.print("Ingresa la altura del triángulo: ");
                    double alturaTri = scanner.nextDouble();
                    System.out.println("El área del triángulo es: " + calcularAreaTriangulo(baseTri, alturaTri));
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
            }
        }
        scanner.close();
    }
}
