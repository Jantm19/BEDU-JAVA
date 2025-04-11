public class Principal_Record {
    public static void main(String[] args) {
        // Crear dos registros
        Entrada_Record entrada1 = new Entrada_Record("Expo Arte 2025", 25.0);
        Entrada_Record entrada2 = new Entrada_Record("Teatro Clásico", 60.0);

        // Mostrar la información
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
    }
}
