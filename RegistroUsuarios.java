import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    String nombre;
    int edad;
    String estado;

    public Usuario(String nombre, int edad, String estado) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }
}

public class RegistroUsuarios {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> lista = new ArrayList<>();

        System.out.print("¿Cuántos usuarios deseas registrar? ");
        int total = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < total; i++) {
            System.out.println("\nRegistro del usuario #" + (i + 1));

            System.out.print("Ingresa nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingresa estado (activo/inactivo): ");
            String estado = scanner.nextLine();

            Usuario usuario = new Usuario(nombre, edad, estado);
            lista.add(usuario);
        }

        int mayores = 0, menores = 0;

        System.out.println("\nDetalle de usuarios");
        for (Usuario u : lista) {
            if (u.edad >= 18) {
                System.out.println(u.nombre + " – Edad: " + u.edad + " – Estado: " + u.estado + " – mayor de edad");
                mayores++;
                
            } else {
                System.out.println(u.nombre + " – Edad: " + u.edad + " – Estado: " + u.estado + " – menor de edad");
                menores++;
            }
        }

        System.out.println("\nResumen");
        System.out.println("Total de usuarios registrados: " + total);
        System.out.println("Usuarios mayores de edad: " + mayores);
        System.out.println("Usuarios menores de edad: " + menores);

        scanner.close();
    }
}


        System.out.print("Ingresa las notas: ");
        // Recorrer el arreglo   y mostrar cada calificación con su índice
        for (int i = 0; i < notas.length; i++) {
            
            //Darle al usuario la entrada a ingresar las notas 
            notas[i] = sc.nextInt();
            System.out.println("Calificación en la posición " + i + ": " + notas[i]);
        }
    }
}
