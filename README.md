# Prueba técnica backend
Servicio REST básico para consultar la información de un cliente.

El cuerpo de la petición debe contener los campos:
- tipoDocumento: C para cédula de ciudadanía y P para pasaporte.
- numeroDocumento: número entre 8 y 11 caracteres.

Para probar el endpoint de la API:
````http request
GET localhost:8080/api/cliente/consultar?tipoDocumento=P&numeroDocumento=123456789
````

Las validaciones de los campos se realizan con las anotaciones de [jakarta.validation.constraints](https://jakarta.ee/specifications/bean-validation/3.0/apidocs/jakarta/validation/constraints/package-summary) directamente en el objeto de transferencia de datos (DTO) de la petición.