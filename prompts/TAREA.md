# Tarea: Mi prompt profesional

## Funcionalidad elegida

Sistema de Cálculo de Notas para un curso universitario (módulo que permite ingresar notas, ponderaciones y calcular el promedio final con un estado de Aprobado o Desaprobado).

## Version 1: prompt basico

```text
Hazme un programa en Java para calcular notas de estudiantes.
```

## Version 2

Actúa como desarrollador Java. Crea una aplicación para calcular notas finales de estudiantes universitarios. Debe permitir ingresar 3 notas parciales con sus respectivos porcentajes. Incluye una interfaz gráfica básica usando Java Swing.

## Version 3: prompt final

```text
Actúa como analista programador Java. Diseña un módulo de cálculo de notas finales para estudiantes universitarios dentro de un sistema académico.

Crea una interfaz gráfica en Java Swing que solicite al usuario 3 notas (entre 0 y 20) y sus ponderaciones en porcentaje (que deben sumar 100%). Muestra el promedio ponderado final y una etiqueta de 'Aprobado' (nota >= 11) o 'Desaprobado'.

Restricciones:
1. No uses librerías externas (solo javax.swing y java.awt).
2. Valida que el usuario no deje campos vacíos y que no ingrese texto o notas fuera del rango 0-20; de lo contrario, muestra un JOptionPane de error.

Ejemplo de método para el cálculo:
public double calcularPromedioPonderado(double[] notas, double[] pesos)

Formato:
Explica brevemente la estructura de clases antes del código y luego presenta la solución completa lista para ejecutar en una sola clase Main.
```

## Componentes del prompt final

| Componente  | Texto de mi prompt final                                                                                                                                                  |
| ----------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Rol         | Actúa como analista programador Java.                                                                                                                                     |
| Contexto    | Diseña un módulo de cálculo de notas finales para estudiantes universitarios dentro de un sistema académico.                                                              |
| Instrucción | Crea una interfaz gráfica en Java Swing que solicite 3 notas (0-20) y sus ponderaciones (sumar 100%). Muestra el promedio final y el estado ('Aprobado' o 'Desaprobado'). |
| Restricción | No uses librerías externas. Valida que los campos no estén vacíos ni tengan texto/valores fuera de rango con JOptionPane.                                                 |
| Ejemplo     | public double calcularPromedioPonderado(double[] notas, double[] pesos)                                                                                                   |
| Formato     | Explica la estructura de clases antes del código y presenta la solución completa lista para ejecutar en una sola clase Main.                                              |

## Evaluacion del resultado

| Criterio                                                                      | Cumple (Sí / No) |
| ----------------------------------------------------------------------------- | ---------------- |
| ¿Está escrito en Java y utiliza Java Swing sin librerías externas?            | Sí               |
| ¿Realiza las validaciones de rango (0-20) y campos no vacíos con JOptionPane? | Sí               |
| ¿Calcula el promedio ponderado y muestra si está Aprobado o Desaprobado?      | Sí               |
| ¿Sigue el formato especificando la estructura antes del código?               | Sí               |

## Errores que evite

1. **Ser demasiado general (Nivel de detalle insuficiente):** En la V1 no especifiqué las reglas del negocio ni la tecnología. Lo evité detallando el rango de notas (0-20), las ponderaciones y el uso explícito de Swing.
2. **No indicar el formato de salida:** Al inicio la IA generaba código disperso. Lo evité agregando la regla de formato para exigir primero la explicación de clases y luego el código completo ejecutable en una sola clase Main.
