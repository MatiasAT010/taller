import java.util.Scanner;

public class InformacionAcademica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingresa tu carrera: ");
        String carrera = scanner.nextLine();

        System.out.print("¿Cuántas asignaturas registrarás? ");
        int nMaterias = scanner.nextInt();
        scanner.nextLine();

        String[] asignaturas = new String[nMaterias];
        int[] calificaciones = new int[nMaterias];

        for (int i = 0; i < nMaterias; i++) {
            System.out.print("Ingresa nombre de la asignatura #" + (i + 1) + ": ");
            asignaturas[i] = scanner.nextLine();

            System.out.print("Ingresa calificación de " + asignaturas[i] + ": ");
            calificaciones[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("\nNombre: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera);

        int suma = 0;
        System.out.println("\nListado de calificaciones:");
        for (int i = 0; i < nMaterias; i++) {
            System.out.println((i + 1) + ") " + asignaturas[i] + " = " + calificaciones[i]);
            suma += calificaciones[i];
        }

        double promedio = (double) suma / nMaterias;
        System.out.println("\nPromedio de calificaciones: " + promedio);

        if (promedio >= 3) {
            System.out.println("Estado: aprobado");
        } else {
            System.out.println("Estado: reprobado");
        }

        scanner.close();
    }
}

