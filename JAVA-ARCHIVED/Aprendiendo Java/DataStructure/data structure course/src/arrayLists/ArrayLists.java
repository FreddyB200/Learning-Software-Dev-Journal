package arrayLists;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<Persona>();

        //Persona persona1 = new Persona(2, "dsdsa", 23);
        //listaPersonas.add(persona1);

        listaPersonas.add(new Persona(1, "leydi", 19));
        listaPersonas.add(new Persona(2, "laura", 18));
        listaPersonas.add(new Persona(3, "freedy", 20));
        listaPersonas.add(new Persona(4, "johan", 19));

        //recorrer for each
        System.out.println("------FOR EACH");
        for (Persona perso : listaPersonas) {
            System.out.println(perso.getNombre());
        }
        //recorrer por indice
         System.out.println("-------FOR CLASICO");
        for (int i = 0; i < listaPersonas.size();i++){
            System.out.println(listaPersonas.get(i).getEdad());
        }


    }



}
