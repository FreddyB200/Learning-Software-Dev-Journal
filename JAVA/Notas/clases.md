## CLASES

- Las clases permiten generalizar un conjunto de objetos.
- empiezan por mayusculas por convencion

### sintaxis
```java
class Nombre_de_la_clase {ARGUMENTO}
public class Carro {lo_que_contiene_la_clase} // 'public' es el modificador de acceso
```

## ATRIBUTOS

- son las caracteristicas intrisicas del objeto
- Se definen a partir de **los tipos de datos primitivos**

## METODO
- `SINTAXIS`
```java
[ambito encapsulamiento] tipoDevuelto NombreMetodo([lista parametros]) [throws listaExcepciones]
{
        //instrucciones
        [return valor;]
        }
```

## OBJETO

### `SINTAXIS`
- Nombre de la clase **nombre del objeto** = *new* Nombre de la clase();
```java
Persona adulto = new Persona();
```

# METODOS: PARAMETROS Y ARGUMENTOS

### PARAMETROS
- Declaracion de atributo (variable) u objeto, utilizando para recibir valores de entrada en la rutina
### ARGUMENTOS
- valor que se envia desde la rutina invocante

## `Declaracion:`
```java
public void metodo ( int a, String b) { //los paranetros se ponen la declaracion del metodo
    // contenido
    // contenido
    // contenido

}
```

## `Invocacion:`
```java
objeto.metodo(3, "hello"); // cuando ponemos datos en la invocacion
```