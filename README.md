# Proyecto CRUD de Usuarios con Spring Boot

Este repositorio contiene un proyecto de ejemplo que implementa las operaciones básicas de CRUD (Crear, Leer, Actualizar y Eliminar) para usuarios utilizando Java, Spring Boot y una arquitectura de programación en capas. Además, se utiliza la herramienta Postman para realizar pruebas y verificar el funcionamiento de las API.

## Tecnologías Utilizadas

- Java
- Spring Boot
- Spring MVC (Model-View-Controller)
- Spring Data JPA
- Base de Datos MySQL
- Postman

## Estructura del Proyecto

El proyecto sigue una estructura en capas para mantener una separación clara de responsabilidades y facilitar el mantenimiento y escalabilidad.

- **modelo**: Contiene las clases que definen la estructura de los objetos de dominio, en este caso, la entidad `Usuario`.
- **repositorio**: Contiene las interfaces que extienden `JpaRepository` para acceder a la base de datos y realizar operaciones de CRUD en la entidad `Usuario`.
- **servicios**: Contiene la lógica de negocio, implementada en clases de servicio, como `UsuarioService`, que utilizan los repositorios para realizar operaciones en la base de datos.
- **controlador**: Aquí se definen los controladores de la API REST, que manejan las solicitudes HTTP y llaman a los servicios correspondientes para procesarlas.
- **vista**: Aunque este proyecto se centra en una API REST y no en una interfaz de usuario, se podría incluir en esta capa cualquier lógica relacionada con la presentación, como transformación de datos para la respuesta.

## Instrucciones de Uso

1. **Clonar el Repositorio**: Clona este repositorio en tu máquina local utilizando el siguiente comando:

   ```
   git clone https://github.com/tu-usuario/tu-repositorio.git
   ```

2. **Importar el Proyecto**: Abre tu entorno de desarrollo favorito (por ejemplo, IntelliJ IDEA o Eclipse) y importa el proyecto como un proyecto de Maven existente.

3. **Configurar la Base de Datos**: Configura los detalles de conexión a la base de datos MySQL en el archivo `application.properties` ubicado en la carpeta `src/main/resources`.

4. **Ejecutar la Aplicación**: Ejecuta la aplicación desde tu entorno de desarrollo o utiliza el siguiente comando en la terminal:

   ```
   mvn spring-boot:run
   ```

5. **Pruebas con Postman**: Abre la herramienta Postman y realiza solicitudes HTTP para probar las operaciones CRUD en la API. Utiliza las URL y métodos correspondientes definidos en los controladores.

## Ejemplos de Solicitudes

- **Crear un Usuario**:

  ```
  POST /users/add
  Body:
  {
      "nombre": "Usuario Ejemplo",
      "lastname": "Apellido Ejemplo"
  }
  ```

- **Obtener todos los Usuarios**:

  ```
  GET /users/list
  ```

- **Obtener un Usuario por ID**:

  ```
  GET /users/list/{id}
  ```

- **Actualizar un Usuario**:

  ```
  PUT /users/update/{id}
  Body:
  {
      "nombre": "Usuario Modificado",
      "lastname": "Apellido Modificado"
  }
  ```

- **Eliminar un Usuario**:

  ```
  DELETE /users/delete/{id}
  ```
