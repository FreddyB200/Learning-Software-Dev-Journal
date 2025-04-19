# MODIFICADORES DE ACCESO    

- Java es un lenguaje **orientado a objetos**, y uno de los principios fundamentales de la programación orientada a objetos es la **encapsulación**. La encapsulación permite *esconder detalles internos y exponer solo lo necesario*. 

```java
package com.miempresa;
```

## `PUBLIC:`
- Esto declara que una clase es **accesible por cualquier otra clase** en cualquier otro **paquete**.
- Cuando una clase es publica, **cualquier otra clase puede crear instancias de esta**, invocar sus metodfos publicos y acceder a sus variables o atributos publicos.

## `PROTECTED:`
-  La clase o metodo es accesible dentro del **mismo paquete y por subclases (herencia) ** (incluso si estan en diferentes paquetes).

## `DEFAULT:`
- (sin modificador explicito) La clase o el metodo es **accesible solo dentro del mimso paquete.**
  

## `PRIVATE:`
- La clase o metodo es **accesible solo dentro de la misma clase.**  Las clases de nivel superior **no pueden ser privadas**
### `EJEMPLOS`

```java

public class Persona {
    // Campo accesible desde cualquier parte
    public String nombre;
    
    // Campo accesible solo dentro del paquete com.miempresa
    int edad;
    
    // Campo accesible solo dentro de la clase Persona
    private String dni;
    
    // Método accesible desde cualquier parte
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
    
    // Método accesible solo dentro del paquete com.miempresa
    void mostrarEdad() {
        System.out.println("Tengo " + edad + " años");
    }
    
    // Método accesible solo dentro de la clase Persona
    private void mostrarDNI() {
        System.out.println("Mi DNI es " + dni);
    }
}

```