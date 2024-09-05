# Microservicio de Gestión de Estudiantes y Cursos

Este proyecto es una aplicación basada en microservicios utilizando Java con Spring Boot. El sistema está dividido en dos servicios:

1. **Servicio de Estudiantes (Students)**
2. **Servicio de Cursos (Courses)**

Ambos servicios se comunican a través de **Eureka**, un servicio de descubrimiento que permite que los microservicios se encuentren entre sí. Los datos se almacenan en dos bases de datos diferentes: **MySQL** para el servicio de estudiantes y **PostgreSQL** para el servicio de cursos.

## Tecnologías Utilizadas

- **Java 17**
- **Spring Boot**
- **JPA** con **Hibernate**
- **Bases de Datos:**
    - MySQL (Estudiantes)
    - PostgreSQL (Cursos)
- **Eureka Server** para el descubrimiento de servicios
- **Maven** para la gestión de dependencias

## Arquitectura del Proyecto

Este proyecto está dividido en dos módulos principales:

1. **Servicio de Estudiantes (Students Service)**
    - Persistencia de estudiantes en una base de datos MySQL.
    - Uso de **JPA** y **Hibernate** para la gestión de entidades y relaciones.
    - Comunicación con el servicio de cursos a través de Eureka.

2. **Servicio de Cursos (Courses Service)**
    - Persistencia de cursos en una base de datos PostgreSQL.
    - Uso de **JPA** y **Hibernate** para la gestión de entidades y relaciones.
    - Comunicación con el servicio de estudiantes a través de Eureka.

## Cómo Ejecutar el Proyecto

### Prerrequisitos

- Tener instalados:
    - **Java 17**
    - **MySQL** y **PostgreSQL**
    - **Maven**

### Pasos para Ejecutar:

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/tu-repositorio.git
