# 📦 Práctica de Algoritmia: Vectores (Arreglos Unidimensionales)

**Objetivo:** Desarrollar la lógica computacional para almacenar, recorrer y manipular secuencias de datos lineales basados en requerimientos de negocio reales.

---

## 🟢 Nivel Básico: Almacenamiento y Búsqueda Lineal

### 🏢 Ejercicio 1: Sistema de Control de Acceso
**Contexto:** Seguridad corporativa.

Una empresa tecnológica tiene un área de servidores de acceso restringido. Actualmente, el guardia debe buscar manualmente en una libreta si la credencial del empleado está autorizada.

**Requerimientos del Sistema:**
1. El sistema debe contener un registro estático con los 5 números de credencial de los técnicos autorizados (Ej. `1024`, `2048`, `4096`, `8192`, `16384`).
2. El programa solicitará al guardia que escanee (ingrese) el número de credencial de la persona que intenta entrar.
3. El sistema debe revisar secuencialmente toda la lista de técnicos autorizados.
4. Si el número coincide con alguno de la lista, imprimirá: `[ACCESO CONCEDIDO] Bienvenido al Site`.
5. Si termina de revisar toda la lista y no encuentra el número, imprimirá: `[ALERTA] Acceso denegado. Personal no autorizado`.

### 🌧️ Ejercicio 2: Monitor Pluviométrico Semanal
**Contexto:** Meteorología y Agricultura local.

Para determinar si es necesario encender el sistema de riego, una huerta necesita analizar la cantidad de lluvia que cayó durante la semana.

**Requerimientos del Sistema:**
1. El programa solicitará al usuario ingresar la cantidad de lluvia (en milímetros) que cayó en cada uno de los 7 días de la semana, guardando estos datos estructuradamente en la memoria.
2. Al finalizar la captura, el sistema calculará la suma total de lluvia y el promedio de milímetros por día.
3. Finalmente, el sistema realizará un segundo análisis sobre los datos guardados para contar e imprimir **cuántos días** la lluvia superó el promedio semanal.

---

## 🟡 Nivel Intermedio: Arreglos Paralelos y Manipulación de Índices

### 🎓 Ejercicio 3: Cuadro de Honor Académico
**Contexto:** Gestión escolar.

La dirección académica necesita automatizar la detección del mejor y peor promedio de un grupo pequeño para asignar tutorías y entregar reconocimientos.

**Requerimientos del Sistema:**
1. El sistema debe manejar dos listas de datos vinculadas lógicamente: una para almacenar los nombres de 5 alumnos, y otra para almacenar la calificación final de esos mismos 5 alumnos.
2. El programa pedirá al profesor que ingrese el nombre del alumno y, acto seguido, su calificación, hasta completar los 5 registros.
3. El sistema debe analizar las calificaciones almacenadas para encontrar el valor más alto y el valor más bajo.
4. Al terminar el análisis, debe imprimir el nombre del alumno con la mejor calificación y el nombre del alumno con la calificación más baja. *(Nota para el alumno: Piensa cómo el índice de la calificación te ayuda a encontrar el nombre correcto).*

### 🚚 Ejercicio 4: Reporte Inverso de Embarque
**Contexto:** Logística y almacenes.

Un almacén recibe cajas de mercancía a través de una banda transportadora. Por la forma en que se apilan en el camión de reparto, la primera caja en entrar al almacén será la última en salir para el cliente.

**Requerimientos del Sistema:**
1. El programa solicitará al operador escanear el "Número de Serie" (texto) de 6 cajas consecutivas que van llegando por la banda transportadora, guardándolas en memoria en el orden exacto de llegada.
2. Para generar la "Hoja de Embarque" del camión, el sistema debe imprimir la lista de cajas almacenadas, pero en **orden estrictamente inverso** (desde la última caja que entró, hasta la primera).

---

## 🔴 Nivel Avanzado: Algoritmos de Fusión y Ordenamiento

### 🏭 Ejercicio 5: Fusión de Líneas de Producción
**Contexto:** Optimización industrial.

Una fábrica de empaques cuenta con dos máquinas diferentes produciendo lotes. Para el envío final, el sistema de software necesita consolidar (juntar) la información de ambas máquinas en un solo bloque de datos.

**Requerimientos del Sistema:**
1. El sistema tendrá registrados en memoria los pesos generados por la **Máquina A** (lote de 4 cajas: `12.5`, `13.0`, `12.8`, `13.2`) y la **Máquina B** (lote de 3 cajas: `14.1`, `14.0`, `13.9`).
2. El programa no debe solo imprimir los datos, sino que debe crear en memoria una **nueva estructura de datos más grande** (que tenga la capacidad exacta para ambos lotes sumados).
3. Mediante lógica computacional, el programa debe copiar todos los datos de la Máquina A hacia la nueva estructura, y justo donde termina la A, acomodar todos los datos de la Máquina B.
4. Al final, imprimir el inventario consolidado desde la nueva estructura unificada.

### 🚑 Ejercicio 6: Triage de Urgencias (Ordenamiento)
**Contexto:** Sistema hospitalario.

La sala de urgencias tiene un monitor donde se registran los pacientes que van llegando. Actualmente aparecen en orden de llegada, pero los médicos necesitan que el sistema reacomode la lista automáticamente para que los casos más graves pasen al principio.

**Requerimientos del Sistema:**
1. El programa solicitará registrar el "Nivel de Urgencia" (del 1 al 10, donde 10 es crítico) de 5 pacientes en el orden en el que llegaron al hospital.
2. El sistema imprimirá el estado actual de la sala: `Orden de llegada: [3, 8, 1, 9, 4]`.
3. El sistema debe ejecutar una rutina interna que **modifique físicamente** las posiciones de los elementos dentro de la estructura, de manera que los números queden organizados de Mayor a Menor.
4. Al finalizar la reubicación, el sistema imprimirá: `Orden de atención (Triage): [9, 8, 4, 3, 1]`. *(Nota para el alumno: Investiga qué es el intercambio de variables y cómo aplicarlo dentro de ciclos para lograr este objetivo).*
