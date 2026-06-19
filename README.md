# Aplicación de Turismo de Llanquihue

## Descripción del Sistema
Este proyecto es una aplicación de consola desarrollada en Java para la gestión de tours y guías turísticos de la agencia "LlanquihueTour". 
El sistema permite cargar datos desde archivos de texto (`.txt`) para administrar la información de los guías disponibles y las características de los tours ofrecidos.

## Paquetes y Clases Implementadas

### Paquete `cl.duoc.app`
* **`Main`**: Clase principal del programa. Se encarga de ejecutar la aplicación, instanciar el `DataManager` y probar la carga de guías y tours desde los archivos de datos.

### Paquete `model`
Contiene las entidades que representan el negocio:
* **`AdministradorGuias`**: Representa a la agencia de turismo. Contiene el nombre de la agencia y una lista (`ArrayList`) de objetos `Guia`. Permite agregar y eliminar guías.
* **`Guia`**: Representa a un guía turístico individual. Sus atributos son: `nombre`, `especialidad` y `añosExperiencia`.
* **`Tour`**: Representa un tour turístico. Sus atributos son: `duracion`, `dificultad`, `incluyeTransporte`, `temporada` y `ubicacion`.

### Paquete `data`
Contiene la lógica de persistencia de datos:
* **`DataManager`**: Clase encargada de leer y escribir la información en archivos de texto. 
  * Utiliza `guias.txt` para gestionar los datos de `AdministradorGuias`.
  * Utiliza `tour.txt` para gestionar los datos de `Tour`.

## Instrucciones para ejecutar el programa

Sigue estos pasos para ejecutar la aplicación desde tu entorno de desarrollo (IDE como IntelliJ IDEA, Eclipse o desde la terminal):

1. **Clona el repositorio** o descarga los archivos del proyecto.
2. **Abre el proyecto** en tu IDE de Java preferido.
3. Asegúrate de que los archivos de datos (`guias.txt` y `tour.txt`) se encuentren en la raíz del proyecto (al mismo nivel que la carpeta `src`).
4. Navega hasta la clase **`Main`** ubicada en el paquete `cl.duoc.app`.
5. Ejecuta el método `main`.
6. El programa mostrará en la consola la información cargada de los guías y el tour disponible.
