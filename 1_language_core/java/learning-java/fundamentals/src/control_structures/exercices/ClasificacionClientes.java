package control_structures.exercices;

public class ClasificacionClientes {
    public static void main(String[] args) {
        // Historial de pagos de los clientes (número de semanas de retraso)
        int[] semanasDeRetraso = {0, 1, 5, 2, 5};
        String[] nombresClientes = {"Juan", "Maria", "Carlos", "Ana", "Luis"};


        for (int i =0; i< nombresClientes.length; i++){
            String cliente = nombresClientes[i];
            int semanasRetraso = semanasDeRetraso[i];
            String clasificacion = "";
            String mensajeAdvertencia = "";
            if(semanasRetraso == 0){
                clasificacion = "Excelente";
            } else if (semanasRetraso <= 2){
                clasificacion = "Bueno";
            } else {
                clasificacion = "Riesgoso";
                if(semanasRetraso > 3){
                    mensajeAdvertencia = "+ ¡Atención! El cliente "+ cliente + " tiene un alto retraso en sus pagos.";
                }
            }
            System.out.println("- Cliente: "+ cliente + " \n- Clasificacion: " + clasificacion);
            if(!mensajeAdvertencia.isEmpty()){
                System.out.println(mensajeAdvertencia);
            }

        }
    }
}
