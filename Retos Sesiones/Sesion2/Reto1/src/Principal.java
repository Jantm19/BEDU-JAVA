import java.util.Scanner;

/**
 * Clase Principal:
 * Esta clase es el punto de inicio del programa. Se encarga de:
 * - Pedir los datos del paciente al usuario (nombre, edad, número de expediente).
 * - Crear un objeto `Paciente` usando esos datos.
 * - Mostrar la información del paciente en la consola.
 */
public class Principal {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el nombre del paciente
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();

        // Pedir al usuario que ingrese la edad del paciente
        System.out.print("Ingrese la edad del paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        // Pedir al usuario que ingrese el número de expediente
        System.out.print("Ingrese el número de expediente: ");
        String expediente = scanner.nextLine();

        // Crear un objeto Paciente con los datos que ingresó el usuario
        Paciente paciente = new Paciente();
        paciente.nombre = nombre;  // Asignar el nombre
        paciente.edad = edad;      // Asignar la edad
        paciente.numero_expediente = expediente;  // Asignar el número de expediente

        // Mostrar la información del paciente
        System.out.println("\n📋 Información del Paciente:");
        paciente.mostrarInformacion();

        // Cerrar el scanner
        scanner.close();
    }
}
