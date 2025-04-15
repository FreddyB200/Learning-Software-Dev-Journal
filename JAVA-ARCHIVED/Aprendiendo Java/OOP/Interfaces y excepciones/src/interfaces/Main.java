package interfaces;

public class Main {
    public static void main(String[] args) {

        Automovil carro1 = new Automovil();
        Bici mi_bici = new Bici();

        carro1.avanzar();
        carro1.detener();
        carro1.sentar();

        mi_bici.avanzar();
        mi_bici.detener();
        mi_bici.sentar();


    }
}
