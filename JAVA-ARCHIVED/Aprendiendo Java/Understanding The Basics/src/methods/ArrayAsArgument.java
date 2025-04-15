package methods;

public class ArrayAsArgument {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};

        printArray(numeros);
    }

    public static void printArray(int[] array) {
        for (int numero : array) {
            System.out.println(numero);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
