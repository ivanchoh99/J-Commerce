# 🛍️ J-Commerce: The Senior Java Playground (Polyglot Edition)

![Java 21](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![Kotlin](https://img.shields.io/badge/Kotlin-Modern_JVM-purple?style=for-the-badge&logo=kotlin)
![Spring Boot 3](https://img.shields.io/badge/Spring_Boot-3.3+-brightgreen?style=for-the-badge&logo=spring)
![Spring Cloud](https://img.shields.io/badge/Spring_Cloud-Microservices-blue?style=for-the-badge&logo=spring)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue?style=for-the-badge&logo=postgresql)
![Apache Kafka](https://img.shields.io/badge/Apache_Kafka-Event_Streaming-black?style=for-the-badge&logo=apachekafka)
![Docker](https://img.shields.io/badge/Docker-Containerization-blue?style=for-the-badge&logo=docker)

## 📌 Visión General
**J-Commerce** no es un CRUD estándar. Es un ecosistema de microservicios diseñado específicamente como un "Playground" (campo de pruebas) para aplicar, demostrar y dominar los conceptos de ingeniería de software a nivel Mid/Senior. 

El proyecto resuelve problemas reales de arquitectura distribuida, incluyendo:
* Procesamiento masivo de datos (Streams & Batch Inserts).
* Gestión de memoria de la JVM (Heap optimization).
* Concurrencia moderna (Virtual Threads, Multithreading & Coroutines).
* Patrones de microservicios políglotas (Service Discovery, API Gateway, Circuit Breaker).
* Seguridad, Transaccionalidad y Mensajería Asíncrona.

---

## 🏗️ Arquitectura del Sistema

El ecosistema está construido bajo el paradigma **Full Spring Cloud Stack**, combinando el poder transaccional de Java con la elegancia reactiva de Kotlin.

- **API Gateway (Spring Cloud Gateway):** Enrutamiento central y validación de seguridad.
- **Service Registry (Netflix Eureka):** Descubrimiento dinámico de instancias.
- **Catalog Service (Java):** Gestión eficiente de millones de productos (Lectura intensiva).
- **Order Service (Java):** Gestión transaccional de compras (Escritura segura).
- **Inventory Service (Java):** Gestión concurrente de stock (Multithreading y Locks).
- **Notification Service (Kotlin):** Servicio asíncrono y reactivo para el envío de alertas mediante Corrutinas.

---

## 🗺️ Roadmap de Desarrollo & Conceptos Aplicados

Este proyecto se desarrolla en 4 fases incrementales:

### Fase 1: Eficiencia y Core Java (`Catalog-Service`)
- [ ] Generación e inserción de 1,000,000 de registros usando optimización JPA (Batch inserts).
- [ ] Búsquedas eficientes previniendo el problema N+1 y usando EntityGraphs.
- [ ] Filtrado de datos en memoria utilizando `ParallelStreams` y controlando el consumo del *Heap*.
- [ ] Uso profundo de Colecciones (`HashMap` interno, `equals()` y `hashCode()`).

### Fase 2: Transaccionalidad y Spring Boot Avanzado (`Order-Service` & `Auth-Service`)
- [ ] Implementación de DTOs inmutables (Records) y patrones de diseño (Builder, Strategy).
- [ ] Seguridad perimetral con JWT y Spring Security.
- [ ] Dominio de `@Transactional` (Isolation, Propagation) para evitar lecturas sucias.
- [ ] `GlobalExceptionHandler` usando `@ControllerAdvice`.

### Fase 3: Concurrencia y Multithreading (`Inventory-Service`)
- [ ] Actualización concurrente de stock previniendo *Race Conditions*.
- [ ] Implementación de `ReentrantLock` y análisis frente a bloques `synchronized`.
- [ ] Adopción de **Virtual Threads** (Java 21) para escalabilidad vertical masiva.

### Fase 4: Cloud-Native, Mensajería y Ecosistema Políglota (`Infrastructure` & `Notification-Service`)
- [ ] **Service Discovery & API Gateway:** Implementación de Eureka y Gateway con *Client-Side Load Balancing*.
- [ ] **Comunicación Asíncrona (Kafka):** Integración de Apache Kafka para publicar eventos de dominio (Ej. *OrderCreatedEvent*).
- [ ] **Ecosistema Políglota (Kotlin):** Creación del `Notification-Service` en Kotlin usando Spring Boot y **Coroutines** para consumir eventos de Kafka de forma asíncrona y no bloqueante.
- [ ] **Resiliencia:** Tolerancia a fallos mediante el patrón *Circuit Breaker* (Resilience4j) en llamadas síncronas.

---

## 🚀 Requisitos Previos
- Java 21+
- Kotlin 1.9+
- Maven 3.9+ / Gradle (para el servicio en Kotlin)
- Docker & Docker Compose (para Postgres, Kafka y Eureka)

## 🛠️ Cómo ejecutar localmente
*(Las instrucciones de despliegue se agregarán a medida que los servicios base estén construidos).*

---
*Proyecto desarrollado con propósitos de mentoría y crecimiento técnico hacia el rol de Senior Backend Engineer.*