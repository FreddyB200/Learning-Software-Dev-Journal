package basics;

public class ArrayExample {
    public static void main(String[] args) {
         int numbers [] = new int[5];


        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[0] = 10;

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Elemento en el índice " + i + ": " + numbers[i]);
        }




    }
}
