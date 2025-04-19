package polimorfismo;

public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo(12, 15);
        Circulo circulo1 = new Circulo(10);

        rectangulo1.setAncho(10);
        rectangulo1.setAlto(12);

        circulo1.setRadio(5);

        double areaCirculo1 = circulo1.calcularArea();
        double areaRect1 = rectangulo1.calcularArea();





        System.out.println("El area del circulo con radio " +circulo1.getRadio() + " metros es de: " + areaCirculo1+ " metros cuadrados");
        System.out.println("El area del rectangulo con un ancho de "+ rectangulo1.getAncho() +" metros Y una altura de "+ rectangulo1.getAlto() + " metros es de: "+ areaRect1 + " metros cuadrados");

    }
}
