Este proyecto contiene 2 aplicaciones (Spring Boot - Angular)
El backend se comunica con una base de datos en memoria H2.

Los puertos y path para acceder a la base de datos en memoria están en application.properties.
Se deberá hacer el siguiente insert para tener un usuario y datos de cambio de divisas:

INSERT INTO EXCHANGE_RATES (CURRENCY_ORIGIN, CURRENCY_DESTINATION, AMOUNT_RATE)
VALUES 
    ('PEN', 'USD', 0.26),
    ('PEN', 'EUR', 0.25),
    ('USD', 'PEN', 3.84),
    ('EUR', 'PEN', 4.05);


INSERT INTO roles (ID, NAME) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

INSERT INTO users (ID, PASSWORD, USER_NAME) VALUES
(1, '$2a$10$c56IEwVzLUE3yDxEeYlEz.RkZ7X8hJnYLr98apCzSiOdc1aVxERhK', 'admin');

INSERT INTO users_roles (USER_ID, ROLE_ID) VALUES
(1, 1),
(1, 2);

Para ello el usuario admin para las pruebas será:
username: admin
password: 12345
