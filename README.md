# PA3-Estructuras-Lineales-Grupo1


##  Objetivo del Trabajo
Modelar procesos reales de una unidad de servicios académicos utilizando estructuras LIFO (pilas) y FIFO (colas) para la gestión eficiente de flujos con cambios constantes y atención en orden de llegada[cite: 15, 16].

##  Integrantes del Grupo
- Jossimar Huamancha (Actividad 1: Pila LIFO)
- [Integrante 2] (Actividad 2: Cola FIFO)
- [Integrante 3] (Actividad 3: Selección de estructuras para situaciones reales)
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

¿Por qué se recomienda la estructura FIFO? 
Porque permite organizar las solicitudes de manera ordenada, garantiza que se atiendan según su llegada y evita que las solicitudes más antiguas queden pendientes mientras se atienden otras más recientes. 

Conclusión: 

La estructura FIFO es la más adecuada para gestionar las solicitudes académicas, ya que garantiza un proceso de atención organizado, justo y basado en el orden de llegada de los estudiantes.
   
- `Actividad_3_Seleccion_Real/`
- `Actividad_4_Comparacion/`

##  Enlace del Video de Exposición
- [Enlace de YouTube - PA3 Grupo 1 (No listado)](PEGA_AQUÍ_EL_ENLACE)
