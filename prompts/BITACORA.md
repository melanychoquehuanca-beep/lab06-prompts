# Bitacora de prompts

Laboratorio 06: Fundamentos de Ingenieria de Prompts.

Herramienta de IA usada: GEMINI

## Ejercicio 2: Tokens y ventana de contexto

| Texto                              | Caracteres | Tokens |
| ---------------------------------- | ---------- | ------ |
| Los estudiantes programan en Java. | 33         | 6      |
| The students program in Java.      | 29         | 6      |
| desafortunadamente                 | 18         | 4      |

**Explicación del experimento GEMINI:**
En el paso 4, la IA respondió correctamente ("TiendaTec" y "Java Swing") porque esa información ya estaba guardada dentro de la ventana de contexto de la misma conversación. En el paso 5, al abrir un chat nuevo, la IA no supo responder ya que la ventana de contexto inició completamente vacía y no conservaba el historial previo.

## Ejercicio 3: Temperatura

| Temperatura | % de BiblioTec | Nombres en los 5 intentos                             |
| ----------- | -------------- | ----------------------------------------------------- |
| 0           | 100.0%         | BiblioTec, BiblioTec, BiblioTec, BiblioTec, BiblioTec |
| 0.5         | 65.3%          | BiblioTec, LibroYa, BiblioTec, BiblioTec, PrestaLibro |
| 1           | 44.5%          | NubeDeTinta, BiblioTec, BiblioTec, BiblioTec, LibroYa |
| 1.8         | 32.2%          | LibroYa, LectoGo, LectoGo, LibroYa, BiblioTec         |

Al subir la temperatura, los porcentajes se distribuyen y los nombres elegidos son más variados y menos predecibles. Sin embargo, el simulador nunca inventa un nombre nuevo porque solo puede seleccionar elementos que ya están predefinidos dentro de su arreglo fijo de opciones.

## Ejercicio 4: Prompt vago vs estructurado

| Criterio                            | Prompt vago | Prompt estructurado |
| ----------------------------------- | ----------- | ------------------- |
| Menciona el objetivo del sistema    | Sí          | Sí                  |
| Menciona a los usuarios principales | No          | Sí                  |
| Tiene exactamente 3 funcionalidades | No          | Sí                  |
| Está en 3 párrafos                  | No          | Sí                  |
| Lo usaría en un informe real        | No          | Sí                  |

El prompt vago suele arrojar varios párrafos o listas sin enfocarse en exactamente 3 funcionalidades, mientras que el prompt estructurado cumple estrictamente todas las restricciones impuestas

## Ejercicio 5: Anatomia de un prompt

| Componente  | Texto de mi prompt                                                                                   |
| ----------- | ---------------------------------------------------------------------------------------------------- |
| Rol         | Actua como desarrollador Java.                                                                       |
| Instrucción | Crea un programa en Java usando una clase Producto con los atributos codigo, nombre, precio y stock. |
| Contexto    | para gestionar los productos de una tienda.                                                          |
| Ejemplo     | Usa este estilo para los metodos: getPrecio(), setPrecio(double precio).                             |
| Formato     | Explica primero la estructura de la clase y luego presenta el codigo Java.                           |

**Evolución por niveles:**

- **Nivel 1:** Genera un programa genérico de Java (como un "Hola Mundo" o calculadora simple) sin ningún enfoque específico[cite: 16].
- **Nivel 2 (Rol):** Mantiene la respuesta genérica pero adopta un tono técnico y explicativo orientado a la programación[cite: 16].
- **Nivel 3 (Contexto):** Define la temática del negocio y crea un programa básico enfocado en gestión de tienda[cite: 16].
- **Nivel 4 (Instrucción):** Especifica la estructura creando la clase `Producto` con los campos solicitados (`codigo`, `nombre`, `precio`, `stock`)[cite: 16].
- **Nivel 5 (Formato + Ejemplo):** Organiza la salida explicando primero la estructura, muestra el código limpio y aplica la sintaxis exacta solicitada para los métodos `getters` y `setters`[cite: 16].

## Ejercicio 6: Del prompt basico al profesional

### Tabla de evaluación del prompt profesional (Paso 3)

| Qué revisar                                            | Cumple (Sí / No) |
| ------------------------------------------------------ | ---------------- |
| ¿Está escrito en Java y usa Swing?                     | Sí               |
| ¿Pide correo y contraseña?                             | Sí               |
| ¿Explica el funcionamiento antes o después del código? | Sí               |
| ¿El código está organizado en clases?                  | Sí               |
| ¿Valida los datos que ingresa el usuario?              | No               |

---

### Prompts utilizados

```text
PROMPT PROFESIONAL INICIAL:
Actua como desarrollador Java. Crea un ejemplo de login para una aplicacion de escritorio utilizando Swing. El usuario debe ingresar correo y contrasena. Explica brevemente el funcionamiento y presenta el codigo organizado por clases.

MEJORA (ITERACIÓN):
Mejora el codigo anterior con estas restricciones: no uses librerias externas, valida que el correo contenga @ y que la contrasena tenga al menos 8 caracteres, y muestra los mensajes con JOptionPane.
```
