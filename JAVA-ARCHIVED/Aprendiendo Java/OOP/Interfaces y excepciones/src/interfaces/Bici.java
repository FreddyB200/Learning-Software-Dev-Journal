package interfaces;

public class Bici implements Rueda, Silla{
    @Override
    public void avanzar(){
        System.out.println("La bici avanza con peleadear.");
    }

    @Override
    public void detener(){
        System.out.println("La bicicleta se detiene.");
    }

    @Override
    public void sentar(){
        System.out.println("Sentarse en un sillin");
    }
}
