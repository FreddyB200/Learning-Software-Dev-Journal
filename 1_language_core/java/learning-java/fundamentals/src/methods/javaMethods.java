package methods;


public class javaMethods {
    public static void main(String[] args) {

        double areaCirculo = calcularAreaCirculo(3.0);
        double areaCirculoInt = calcularAreaCirculo(3);
        System.out.println("El area del circulo es: "+areaCirculo);
    }

    /*
    modificador_de_acceso    tipo_de_retorno   nombre_del_metodo(parámetros) {
        // Cuerpo del metodo: las instrucciones que ejecutará
    }
    */

    //ejercicio practico sobrecarga de metodos
    /*la sobrecarga de metodos ocurre cuando los meotods tienen el mismo nombre pero
    difieren en cantidad, tipo u orden de parametros.
    */
    //Crea un programa que tenga un metodo para calcular el área de un círculo:

    public static double calcularAreaCirculo(double radio){
        return Math.PI * (radio * radio);
    }
    public static double calcularAreaCirculo(int radio){
        return Math.PI * (radio ^ 2);
    }



}


