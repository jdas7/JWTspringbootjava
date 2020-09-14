## CRIPTOGRAFIA JAVA.

```bash
jalvis7@estudiantes.areandina.edu.co
```
Se desarrolla un endpoint en springboot, para realizar la validación de un login
donde se genera un token de autenticación con cifrado de clave simetrica y calve asimetrica.

Un JWT se puede cifrar usando una clave simétrica (secreto compartido) o claves asimétricas (la clave privada de un par privado/público).

para este ejemplo de login se usa el algoritmo SHA-256, que utiliza JWT.

Precondiciones:
    
    - Tener instalado Maven.
    - Tener configurado JDK.
       
Para consumir el API debe consumirlo a traves de postman:

```bash
Endpoint: http://localhost:9192/authenticate
```
```bash
Body Request: {
                  "userName": "jdas7",
                  "password": "password"
              }
```
```bash
Body Response: {HASH}
```

Referencias:
```bash
- Qué es Json Web Token y cómo funciona.
  https://openwebinars.net/blog/que-es-json-web-token-y-como-funciona/#:~:text=JWT%20(JSON%20Web%20Token)%20es,serie%20de%20claims%20o%20privilegios.
```
