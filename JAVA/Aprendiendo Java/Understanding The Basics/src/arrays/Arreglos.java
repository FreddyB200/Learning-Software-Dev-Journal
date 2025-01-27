package arrays;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        //arrays are fixed-size so i cant  keep addding or deleting elements
//        //static initialization
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        //dymanic initialization
////        int[] nums = new int[11]; //declaration
//        nums[0] = 42;
//        System.out.println(Arrays.toString(nums));
//        //print length
//        System.out.println(nums.length);
//        //sort the array
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        System.out.println("the first element is "+ nums[0]);
//
        Scanner sc = new Scanner(System.in);


        String[] clientes = new String[6];
        clientes[0] = "Jose mendiola";
        clientes[1] = "maria castro";
        clientes[2] = "Roso debia";
        clientes[3] = "Familia Rios";
        clientes[4] = "Familia Ezquivel";
        clientes[5] = "Familia cardenas";

        int [] precios = new int[clientes.length];
        precios[0] = 100;
        precios[1] = 200;
        precios[2] = 300;
        precios[3] = 400;
        precios[4] = 500;
        precios[5] = 600;

        for (int i = 0; i < precios.length; i++) {

            System.out.println(precios[i]);
        }

        for (int i : precios) System.out.println(i);

        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientes[i]);
        }
        for (String i : clientes) System.out.println(i);




        //Looping through Arrays
        //way 1
//        for (int i = 0; i<nums.length;i++) {
//            System.out.println(nums[i]);
//        }
//        //way
//        for (int i : nums) {
//            System.out.println(i);
//        }



//        //methods
//        int index = Arrays.binarySearch(nums, 42);
//        System.out.println("index of 42: "+ index);
//        //filling the array
//        //Arrays.fill(nums, 10);  // Fills the entire array with the value 10
//        //System.out.println(Arrays.toString(nums));
//
//
//        //2d arrays
//        //Declaration of 2D Array
//        //int[][] matrix = new int[3][3] //3x3 matrix
//        //nitialization of 2D Array
//        int[][] matrix = {{1, 2, 3}, {4,5,6}, {7,8,9}};
//        System.out.println(matrix.length);
//
//        for (int i = 0; i < matrix.length; i++) {
//            for(int j = 0; j < matrix[i].length; j++) {
//                System.out.println(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Recorriendo con for-each:");
//        for (int[] row : matrix) {  // Recorremos cada fila de la matriz
//            for (int num : row) {    // Recorremos los elementos de cada fila
//                System.out.print(num + " ");  // Imprimir cada número
//            }
//            System.out.println();
//
//
//            }
        }
    }

