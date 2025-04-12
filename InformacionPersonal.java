import java.util.Scanner;
public class InformacionPersonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaración y asignación de variables
        //Indicamos al usuario que debe ingresar y leemos datos
        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
         System.out.println("Ingresa tu inicial: ");
        String inicial = sc.nextLine();
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingresa tu estatura: ");
        double estatura = sc.nextDouble();
        System.out.println("Ingresa tu eres estudiante?: ");
        boolean esEstudiante = sc.nextBoolean();

        // Mostrar la información personal en consola
        System.out.println("Hola, me llamo " + nombre + ". Tengo " + edad + " años, mido " + 
                           estatura + " metros, mi inicial es " + inicial + " y es estudiante? " + esEstudiante);

        // Declaración e inicialización de un arreglo de calificaciones
        int[] notas = {85, 90, 78, 92, 88};
        System.out.print("Ingresa las notas: ");
        // Recorrer el arreglo   y mostrar cada calificación con su índice
        for (int i = 0; i < notas.length; i++) {
            
            //Darle al usuario la entrada a ingresar las notas 
            notas[i] = sc.nextInt();
            System.out.println("Calificación en la posición " + i + ": " + notas[i]);
        }
    }
}
