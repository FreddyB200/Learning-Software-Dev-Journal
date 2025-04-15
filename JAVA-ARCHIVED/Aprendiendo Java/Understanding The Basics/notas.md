# Notas sobre Variables en Java

## **Variables**
Una **variable** es un espacio en memoria que tiene un nombre asociado y puede contener un valor.

### Declaración
Asignar el tipo de dato y nombre de la variable sin darle un valor inicial.

```java
int numero;
```

### Definición
Asignar el tipo de dato y nombre de la variable dándole o no un valor inicial.

```java
int numero = 5;
```

## Tipos de Variables
- **Variables primitivas:** Almacenan valores básicos.
- **Variables de referencia:** Almacenan la dirección de memoria que apunta a objetos.

## Tipos de Datos

### No primitivos o referenciados
- `String data type`
```java
String myString = "hello world!";
```
- `Arrays`
```java
int[] myArray = (1, 2, 3, 4, 5, 6, 7, -3, 9, -1);
```

### Enteros

- `byte:` -128 a 127  ----  **(8 bits)**
- `short:` -32768 a 32767  ----  **(16 bits)**
- `int:`  -2,147,483,648 a 2,147,483,647 ---- **(32 bits)**
- `long:` -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 ---- **(64 bits)**


## **Ejemplos:**

```java
byte numero = 4; 
long numero2 = 23144214L;
int numero3 = 32131121;
short numero4 = 23121;
```

### Decimales o Reales
- `double`

```java
float flotante = 5.6435f;
double decimales = 5.665643;
```

### Caracteres
- `char`

```java
char letra = 'c';
```

### Booleanos
- `boolean`

```java
boolean v = true;
boolean f = false;
```

### Cadenas de caracteres
- `string`

```java
String cadena = "Hola esta es mi primera clase de java con el curso de sergio code";
```

### Mostrar variables en pantalla

```java
System.out.println(numero);
system.out.println(Arrays.toString(myArray));
System.out.println(decimales);
System.out.println(numero2);
System.out.println(numero3);
System.out.println(numero4);
System.out.println(letra);
System.out.println(f);
System.out.println(v);
System.out.println(cadena);
```
