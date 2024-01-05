## API-Java-PostgreSQL

Este proyecto se basa en una arquitectura de microservicios utilizando Spring Boot. La arquitectura de microservicios implica dividir el proyecto en pequeños servicios independientes, a diferencia de una arquitectura monolítica donde todo está en un solo paquete.

### Principios Clave
- Microservicios: Implementaremos microservicios para realizar tareas específicas.
- URI y Versionado: Utilizaremos URIs para identificar recursos, y versionaremos las APIs para manejar cambios.
- Verbos y Métodos HTTP: Utilizaremos los métodos HTTP típicos como GET, POST, PUT y DELETE para realizar operaciones CRUD.
- Respuestas y Códigos HTTP: Las respuestas incluirán códigos HTTP indicando el éxito o error de la operación.

### Notas Adicionales
- Persistencia de Datos: Se utilizará Spring Data JPA con Hibernate para gestionar la persistencia de datos.
- Versionado de API: Es importante versionar las APIs para gestionar cambios y garantizar la compatibilidad.
