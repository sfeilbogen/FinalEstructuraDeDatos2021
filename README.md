# Sistema de Gestión de Entrada a Museos - Final Estructura De Datos 2021

**Materia**: Estructura de Datos y Programación  
**Año**: 2021, 2do cuatrimestre

Este proyecto fue desarrollado como parte de la materia **Estructura de Datos y Programación**, y consiste en un sistema de **gestión de museos** que permite la administración de entradas y usuarios. El sistema está diseñado para dos tipos de usuarios: **Administrador** y **Cliente**, y utiliza múltiples estructuras de datos y clases para organizar y gestionar la información de manera eficiente.

## Descripción del Proyecto

### Objetivo
El objetivo principal del sistema es gestionar la entrada de visitantes a los museos, permitiendo la **creación y gestión de clientes** y **tickets de entrada**. Además, incluye funcionalidades específicas para la administración del sistema.

### Tipos de Usuarios
1. **Administrador**: Usuario con permisos para gestionar el sistema completo, como cargar y modificar museos, gestionar listas de clientes y tickets.
2. **Cliente**: Usuario regular que puede consultar la disponibilidad de tickets y realizar reservas para visitar los museos.

## Clases Utilizadas
El sistema se estructura a partir de varias clases que representan tanto a los usuarios como a las funcionalidades de gestión:

- **Cliente**: Representa a los usuarios que ingresan al museo.
- **Listacliente**: Maneja la lista de clientes, implementando estructuras de datos eficientes para almacenar y buscar clientes.
- **Listaticket**: Encargada de gestionar la lista de tickets disponibles para los museos.
- **Main**: Clase principal que ejecuta el programa.
- **Museos**: Contiene la información sobre los museos disponibles y sus características.
- **Nodocliente**: Implementación de un nodo para estructurar la lista de clientes.
- **Nodoticket**: Implementación de un nodo para estructurar la lista de tickets.
- **Read**: Clase encargada de leer y cargar datos desde archivos externos al programa.
- **Ticket**: Clase que define las características de un ticket de entrada.

## Investigación sobre Carga de Datos
El trabajo incluyó una investigación detallada sobre **técnicas de carga de datos** al programa, optimizando la gestión de archivos y estructuras de datos para mejorar el rendimiento en la carga masiva de clientes y tickets.

## Estructuras de Datos
El sistema implementa una variedad de **estructuras de datos** para optimizar el almacenamiento y manipulación de información, tales como:
- **Listas** para la gestión de clientes y tickets.
- **Colas** y **pilas** para manejar operaciones específicas dentro del sistema.

## Funcionalidades Clave
- Registro y actualización de información de clientes.
- Gestión de tickets de entrada, incluyendo su compra y cancelación.
- Administración de la información sobre museos y sus tickets disponibles.
- Carga y manejo eficiente de datos externos utilizando estructuras de datos adecuadas.
