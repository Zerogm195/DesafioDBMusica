# Desafío DB Música

## Instalación

Sigue estos pasos para configurar e iniciar la aplicación:

<h3>Clona este repositorio:</h3>

```css

git clone https://github.com/Zerogm195/DesafioDBMusica

```

<h3>Navega al directorio del proyecto:</h3>

```bash

cd DesafioDbMusica

```

<h3>Abre el archivo application.properties y configura las credenciales de tu base de datos:</h3>

```properties

spring.datasource.url=jdbc:postgresql://${DB_HOST}/${DB_NAME}

spring.datasource.username=${DB_USER}

spring.datasource.password=${DB_PASSWORD}

spring.datasource.driver-class-name=org.postgresql.Driver

hibernate.dialect=org.hibernate.dialect.HSQLDialect

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

spring.jpa.format-sql=true

```

<h3>Compila y ejecuta la aplicación:</h3>

```bash
./mvnw spring-boot:run
```

<h2>Uso</h2>
Una vez que la aplicación está en ejecución, el usuario puede interactuar con el menú a través de la consola para registrar datos de cantantes y canciones, y realizar búsquedas. Ejemplo de las opciones del menú:

```css

1 - Registrar cantantes

2 - Registrar canciones

3 - Eliminar cantantes

4 - Eliminar canciones

5 - Buscar canciones

6 - Buscar cantantes


0 - Salir
```

<h3>Registrar Cantantes</h3>
El usuario deberá proporcionar el nombre del cantante, el género y la nacionalidad para registrarlo.

<h3>Registrar Canciones</h3>
El usuario deberá proporcionar el nombre de la canción, el género musical y la duración para registrarla.

<h3>Buscar Canciones y Cantantes</h3>
El usuario puede buscar canciones o cantantes por nombre, y el sistema devolverá la información correspondiente si se encuentra en la base de datos.
