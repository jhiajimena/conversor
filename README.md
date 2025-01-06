# README - Conversor de Moneda

## Bienvenida

¡Bienvenido/a al Conversor de Moneda! Este es un programa desarrollado en Java que permite realizar conversiones entre diferentes monedas de manera fácil y rápida utilizando tasas de cambio en tiempo real.

## Descripción del Proyecto

El Conversor de Moneda es una aplicación de consola que facilita la conversión de montos entre distintas monedas, como el dólar, peso argentino, real brasileño y peso colombiano. Las tasas de cambio se obtienen a través de la API [ExchangeRate API](https://www.exchangerate-api.com/), garantizando información actualizada y precisa.

## Funcionalidades

- Conversión de:
  - Dólar a Peso argentino
  - Peso argentino a Dólar
  - Dólar a Real brasileño
  - Real brasileño a Dólar
  - Dólar a Peso colombiano
  - Peso colombiano a Dólar
- Interfaz amigable basada en consola.
- Uso de tasas de cambio actualizadas en tiempo real mediante peticiones HTTP.

## Cómo Usarlo

1. Asegúrese de tener [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) instalado en su sistema.
2. Descargue el código fuente y el archivo Gson-2.11.0.jar para el manejo de JSON.
3. Compile el proyecto utilizando el siguiente comando:
    ```bash
        javac -cp .;Gson-2.11.0.jar ConversorDeMoneda.java
    ```

4. Ejecute el programa con:
    ```bash
         java -cp .;Gson-2.11.0.jar ConversorDeMoneda
    ```

## Herramientas Utilizadas

- *Lenguaje de Programación*: Java 17
- *Librería*: Gson (versión 2.11.0) para el manejo de JSON
- *API*: [ExchangeRate API](https://www.exchangerate-api.com/) para obtener tasas de cambio
- *Cliente HTTP*: HttpClient (incluido en Java 11+)

## Hecho por

### Pamela Lescano

![linkedin](assets/linkedin.png)
Linkedin: www.linkedin.com/in/pamela-lescano-vila

## **Agradecimiento:**

![alura](assets/logo-aluraespanhol.png)     ![one-education](assets/one.png)