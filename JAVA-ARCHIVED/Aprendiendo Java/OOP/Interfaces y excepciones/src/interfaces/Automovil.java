package interfaces;

public class Automovil implements  Rueda, Silla{
    @Override
    public void avanzar(){
        System.out.println("El automovil avanza con una velocidad constante de "+ VALOR +" km/h.");
    }

    @Override
    public void detener(){
        System.out.println("El automovil se detiene.");
    }

    @Override
    public void sentar(){
        System.out.println("sentarte de una de las comodas sillas del carro.");
    }
}
