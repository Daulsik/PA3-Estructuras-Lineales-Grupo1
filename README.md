# PA3-Estructuras-Lineales-Grupo1


##  Objetivo del Trabajo
Modelar procesos reales de una unidad de servicios académicos utilizando estructuras LIFO (pilas) y FIFO (colas) para la gestión eficiente de flujos con cambios constantes y atención en orden de llegada[cite: 15, 16].

##  Integrantes del Grupo
- Jossimar Huamancha (Actividad 1: Pila LIFO)
- Richard Mucho Mamani (Actividad 2: Cola FIFO)
- Juan Steve Paco Becerra (Actividad 3: Selección de estructuras para situaciones reales)
- Gabriel Sebastian Valdiviezo Castillo (Actividad 4: Comparación y argumentación)



##  Estructura del Repositorio
- `Actividad_1_Pila_LIFO/`
- `Actividad_2_Cola_FIFO/`

La estructura FIFO significa Primero en entrar, primero en salir. Se caracteriza porque los elementos que ingresan primero a la cola son los primeros en ser atendidos o retirados.

Características principales:
- Orden de llegada: Los elementos se atienden respetando el orden en que ingresaron. 
- Inserción: Permite agregar nuevos elementos al final de la cola. 
- Eliminación: Permite retirar el elemento que se encuentra al frente. 
- Frente: Permite consultar el primer elemento sin eliminarlo. 
- Cola vacía: Ocurre cuando no existen elementos pendientes de atención.
 

Ejemplo del caso:
Llegan tres solicitudes a la unidad de servicios académicos: 
 
La primera solicitud en ingresar será la primera en ser atendida.

<img width="793" height="291" alt="image" src="https://github.com/user-attachments/assets/0c484686-68f2-4344-ac63-ef806d2451fd" />

Funcionamiento:

Insertar: Cuando llega una nueva solicitud, se agrega al final de la cola. Por ejemplo, se registra la solicitud de Pedro después de las solicitudes de Juan y María. 

Eliminar: Cuando la unidad académica atiende una solicitud, se elimina la primera de la cola. En este caso, primero se atiende a Juan. 

Frente: Permite visualizar cuál es la siguiente solicitud que debe atenderse sin retirarla. 

Esta vacio: Verifica si existen solicitudes pendientes de atención.


-Algoritmos de una cola FIFO

Algoritmo para Encolar:

    ALGORITMO ENCOLAR(dato) 

    SI FINAL = MAXIMO - 1 ENTONCES 

        ESCRIBIR "La cola está llena" 

    SINO 

        SI FRENTE = -1 ENTONCES 

            FRENTE = 0 

        FIN SI 

     FINAL = FINAL + 1 

        COLA[FINAL] = dato 

  

        ESCRIBIR "Solicitud agregada correctamente" 

    FIN SI 

    FIN ALGORITMO

Algoritmo para Desencolar:

    ALGORITMO DESENCOLAR() 

    SI FRENTE = -1 O FRENTE > FINAL ENTONCES 

        ESCRIBIR "La cola está vacía" 

    SINO 

        DATO = COLA[FRENTE] 

        FRENTE = FRENTE + 1 

  

        SI FRENTE > FINAL ENTONCES 

            FRENTE = -1 

            FINAL = -1 

        FIN SI 

  

        ESCRIBIR "Solicitud atendida: ", DATO 

    FIN SI 

    FIN ALGORITMO


Algoritmo para Visualizar al Frente de la Cola:

    ALGORITMO VER_FRENTE() 

    SI FRENTE = -1 ENTONCES 

        ESCRIBIR "La cola está vacía" 

    SINO 

        ESCRIBIR "Primera solicitud: ", COLA[FRENTE] 

    FIN SI 

    FIN ALGORITMO

Algoritmo para Verificar si la Cola esta Vacia:

    ALGORITMO COLA_VACIA() 

    SI FRENTE = -1 ENTONCES 

        ESCRIBIR "La cola está vacía" 

    SINO 

        ESCRIBIR "La cola contiene solicitudes" 

    FIN SI 

    FIN ALGORITMO 

-Aplicación concreta de la estructura FIFO en el caso

Una aplicación concreta sería el sistema de atención de solicitudes académicas de los estudiantes. 

Ejemplo: 

- El estudiante A registra una solicitud a las 8:00 a. m. 

- El estudiante B registra una solicitud a las 8:05 a. m. 

- El estudiante C registra una solicitud a las 8:10 a. m. 

El orden de atención será A, B y C, respetando el orden de llegada.


Conclusión: 

La estructura FIFO es la más adecuada para gestionar las solicitudes académicas, ya que garantiza un proceso de atención organizado, justo y basado en el orden de llegada de los estudiantes.
   
- `Actividad_3_Seleccion_Real/`

  Actividad 3: Selección de Estructura para Situaciones Reales 
1. Registro de acciones recientes para revertir cambios
	Estructura Seleccionada: Pila (LIFO). 
	Análisis del Flujo y Operaciones: Cada modificación efectuada en el modulo se registra en la estructura ejecutando la operación push. La acción recién realizada se ubica en el extremo superior o Tope . Cuando el usuario ejecuta la función de deshacer , el sistema invoca pop(), extrayendo directamente la última acción realizada. 
	Justificación Técnica y Eficiencia: La operación pop() sobre el tope ofrece una complejidad temporal de O(1). Esto permite revertir estados en orden cronológico inverso de forma inmediata. 
2. Atención de solicitudes en orden de llegada
	Estructura Seleccionada: Cola (FIFO). 
	Análisis del Flujo y Operaciones: Cuando los estudiantes registran solicitudes de trámite la plataforma ejecuta encolar por el extremo posterior o final Las ventanillas de atención académica procesan los requerimientos invocando desencolar() desde el extremo anterior o Frente . 
	Justificación Técnica y Eficiencia: El modelo FIFO garantiza equidad distributiva . Tanto la inserción al final como la extracción del frente operan en O(1). 
3. Procesamiento donde el último ingresado debe atenderse primero
	Estructura Seleccionada: Pila (LIFO ). 
	Análisis del Flujo y Operaciones: En sistemas de gestión de eventos urgentes, el último elemento insertado debe tomar precedencia. La nueva entrada se coloca en la cima mediante push(). Dado que la Pila restringe el acceso al resto de nodos, la extracción por pop() devuelve de inmediato el elemento de ingreso más reciente. 
	Justificación Técnica y Eficiencia: El acceso restringido a un único punto de entrada y salida elimina la necesidad de reordenar o recorrer arreglos o listas, manteniendo un tiempo de ejecución constante O(1). 
4. Flujo de espera de trámites pendientes
	Estructura Seleccionada: Cola (FIFO). 
	Análisis del Flujo y Operaciones: Funciona como un búfer de almacenamiento temporal para tareas académicas en segundo plano. A medida que los trámites entran en estado de pendiente, son encolados al final de la estructura. El motor del servidor consume y procesa los trámites en espera desde el frente en forma secuencial. 
	Justificación Técnica y Eficiencia: El uso de una implementación dinámica mediante punteros o una cola circular previene el desperdicio de memoria y garantiza un flujo continuo con complejidad O(1) por cada trámite procesado. 
   













- `Actividad_4_Comparacion/`

##  Enlace del Video de Exposición
- [Enlace de YouTube - PA3 Grupo 1 (No listado)](PEGA_AQUÍ_EL_ENLACE)
