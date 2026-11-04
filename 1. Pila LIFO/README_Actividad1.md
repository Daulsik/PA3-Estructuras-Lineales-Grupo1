# (Pila_LIFO -  Actividad 1: Pila LIFO]
**Integrantes responsables:** Huamancha Perez Jose Jossimar

## 1.1 Explicación teórica y gráfica
- La estructura LIFO  se caracteriza porque el último elemento en ingresar es el primero en salir, limitando el acceso operativo a un único extremo denominado **tope o cima**. En el caso de estudio de la unidad de servicios académicos, se aplica para el registro secuencial de acciones administrativas que requieren la capacidad de deshacerse en orden inverso.



  
- [Insertar esquema o representación gráfica].

ESTRUCTURA LIFO (Last In, First Out)
       
       [TOPE / CIMA] ---> | Modificación de notas del ciclo       |  <-- (Última en entrar, 
                          +-------------------------------------+        primera en salir)
                          | Actualización de datos personales   |
       [FONDO]      ---> | Registro inicial de solicitud       |  <-- (Primera en entrar,
                          +-------------------------------------+        última en salir)
  
## 1.2 Algoritmos diseñados
- ```java
// Estructura del Nodo interno
public static class Nodo {
    String descripcionAccion;
    Nodo siguiente;
    public Nodo(String descripcionAccion) {
        this.descripcionAccion = descripcionAccion;
        this.siguiente = null;
    }
}

private Nodo cima;

// Operación Apilar (Push) - O(1)
public void apilar(String accion) {
    Nodo nuevo = new Nodo(accion);
    nuevo.siguiente = cima;
    cima = nuevo;
}

// Operación Desapilar (Pop) - O(1)
public String desapilar() {
    if (cima == null) return null; // Validación de pila vacía (Underflow)
    String removida = cima.descripcionAccion;
    cima = cima.siguiente;
    return removida;
}

## 1.3 Aplicación en el caso real / Justificación técnica
- Se seleccionó una pila (LIFO) porque modela perfectamente el comportamiento de un historial de cambios o función "deshacer", asegurando que la última modificación realizada sobre un expediente o trámite sea la primera en revertirse con una eficiencia algorítmica constante de $\mathcal{O}(1)$.

