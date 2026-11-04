public class PilaAcciones {

    // Definición del nodo interno para la pila
    public static class Nodo {
        String descripcionAccion;
        Nodo siguiente;

        public Nodo(String descripcionAccion) {
            this.descripcionAccion = descripcionAccion;
            this.siguiente = null;
        }
    }

    private Nodo cima; // Tope de la pila

    public PilaAcciones() {
        this.cima = null;
    }

    // 1. Verificar si la pila está vacía (isEmpty)
    public boolean estaVacia() {
        return cima == null;
    }

    // 2. Apilar (Push) - O(1)
    public void apilar(String accion) {
        Nodo nuevo = new Nodo(accion);
        nuevo.siguiente = cima;
        cima = nuevo;
        System.out.println("-> Apilado: " + accion);
    }

    // 3. Desapilar (Pop) - O(1)
    public String desapilar() {
        if (estaVacia()) {
            System.out.println("Underflow: La pila está vacía, no hay acciones que deshacer.");
            return null;
        }
        String accionRemovida = cima.descripcionAccion;
        cima = cima.siguiente; // Se desplaza la cima al siguiente nodo
        System.out.println("<- Desapilado (Revertido): " + accionRemovida);
        return accionRemovida;
    }

    // 4. Visualizar el elemento del tope (Peek / Top)
    public String verTope() {
        if (estaVacia()) {
            return "La pila está vacía.";
        }
        return cima.descripcionAccion;
    }

    // Método auxiliar para mostrar la pila completa
    public void mostrarPila() {
        Nodo actual = cima;
        System.out.println("\n--- HISTORIAL DE ACCIONES (TOPE A FONDO) ---");
        if (estaVacia()) {
            System.out.println("[Pila Vacía]");
        }
        while (actual != null) {
            System.out.println(" | " + actual.descripcionAccion + " | ");
            actual = actual.siguiente;
        }
        System.out.println("---------------------------------------------\n");
    }

    // Método principal (Main) para pruebas y ejecución en video
    public static void main(String[] args) {
        PilaAcciones historial = new PilaAcciones();

        System.out.println("=== REGISTRANDO ACCIONES EN EL SISTEMA ACADÉMICO ===");
        historial.apilar("1. Registro inicial de solicitud");
        historial.apilar("2. Actualización de datos personales");
        historial.apilar("3. Modificación de notas del ciclo");

        historial.mostrarPila();

        System.out.println("Elemento actual en el tope (Peek): " + historial.verTope() + "\n");

        System.out.println("=== APLICANDO ACCIÓN DE REVERTIR (CTRL + Z / UNDO) ===");
        historial.desapilar(); // Elimina la modificación de notas

        historial.mostrarPila();
    }
}
