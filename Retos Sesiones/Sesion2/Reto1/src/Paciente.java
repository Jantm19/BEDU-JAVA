/**
 * Clase Paciente:
 * Esta clase define un objeto que representa a un paciente con los atributos:
 * - Nombre: El nombre del paciente.
 * - Edad: La edad del paciente.
 * - Expediente: El número de expediente del paciente.
 *
 * La clase incluye:
 * - Un método `mostrarInformacion()` que imprime en consola la información del paciente.
 */
public class Paciente {
    // Atributos del paciente (son públicos en este caso)
    String nombre;
    int edad;
    String numero_expediente;

    /**
     * Método para mostrar la información del paciente en consola.
     * Este método imprime en pantalla el nombre, la edad y el expediente del paciente.
     */
    public void mostrarInformacion(){
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numero_expediente);
    }
}
