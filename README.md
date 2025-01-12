#Sistema de Gestión Inicial en Java

Este es un proyecto inicial desarrollado en Java que utiliza archivos de texto (txt) como base de datos. El proyecto implementa principios de Programación Orientada a Objetos (POO) y cuenta con un sistema de autenticación y menús diferenciados para cada tipo de usuario.

### Características

- **Programación Orientada a Objetos (POO):** El sistema está diseñado utilizando clases y objetos para garantizar modularidad y escalabilidad.

- **Autenticación de Usuarios:** Los usuarios pueden iniciar sesión con credenciales almacenadas en un archivo de texto.

- **Menús Personalizados:** Cada tipo de usuario tiene acceso a opciones específicas en función de su rol.

- **Base de Datos Local:** La información se almacena en archivos de texto, eliminando la necesidad de una base de datos compleja.

## Estructura del Proyecto

```proyecto-java
|-- src
|   |-- Main.java
|   |-- Usuario.java
|   |-- Administrador.java
|   |-- Cliente.java
|   |-- GestorArchivos.java
|-- data
|   |-- usuarios.txt
|-- README.md
```

Descripción de los Archivos

``: Clase principal que inicia el programa y gestiona la lógica de autenticación y navegación por los menús.

``: Clase base que define las propiedades y comportamientos generales de un usuario.

``: Clase derivada de Usuario que incluye funcionalidades específicas para administradores.

``: Clase derivada de Usuario con funcionalidades específicas para clientes.

``: Clase encargada de leer y escribir datos en archivos de texto.

``: Archivo que almacena las credenciales y roles de los usuarios.

Requisitos del Sistema

Java Development Kit (JDK): Version 8 o superior.

Entorno de Desarrollo Integrado (IDE): Recomendado IntelliJ IDEA, Eclipse o NetBeans.

Instalación

Clona este repositorio:

git clone https://github.com/tuusuario/proyecto-java.git

Importa el proyecto en tu IDE favorito.

Asegúrate de que el archivo usuarios.txt esté presente en la carpeta data.

Ejecuta el archivo Main.java.

Uso

Al iniciar el programa, ingresa tus credenciales.

Dependiendo de tu rol, se mostrará un menú con opciones específicas.

Sigue las instrucciones del menú para realizar las operaciones disponibles.

Contribuciones

Haz un fork del repositorio.

Crea una rama para tu función:

git checkout -b nueva-funcion

Realiza tus cambios y haz un commit:

git commit -m "Agregada nueva función"

Envía tus cambios:

git push origin nueva-funcion

Abre un Pull Request.

Licencia

Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo LICENSE para más información.

Autor

[Tu Nombre]Cualquier duda o sugerencia, no dudes en contactarme a través de [tu correo electrónico].

¡Gracias por utilizar este sistema! Esperamos que sea un gran punto de partida para tus futuros proyectos en Java.

