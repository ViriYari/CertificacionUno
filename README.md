# CertificacionUno

Proyecto Maven para pruebas automatizadas con Selenium y JUnit.

## Estructura del proyecto

- `pom.xml` - configuración principal de Maven.
- `src/main/java` - código fuente (si aplica).
- `src/test/java` - pruebas automatizadas.
- `docker-compose.yml` - servicios dependientes para el pipeline.
- `.github/workflows/test-pipeline.yml` - pipeline de GitHub Actions.

## Comandos útiles

- `mvn clean test` - ejecutar las pruebas.
- `docker compose up -d` - levantar servicios locales si usas Docker.

## GitHub Actions

El workflow `test-pipeline.yml` ejecuta:

1. checkout del repositorio.
2. setup de Java 21.
3. arranque de Docker con `docker-compose.yml`.
4. ejecución de `mvn clean test`.
5. carga de artefactos de fallo desde `target/surefire-reports/`.
