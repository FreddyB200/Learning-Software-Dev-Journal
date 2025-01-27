package arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(myNumbers[0][3]);

        //getting the elements of the matrix usen for loop
        for (int i = 0; i < myNumbers.length; i++){
            for (int j = 0; j <myNumbers[i].length; j++){
                System.out.println(myNumbers[i][j]);
            }
        }
        //getting the elements of the matrix usen for each loop
        for (int[] row : myNumbers){
            for(int i : row) {
                System.out.println(i);
            }
        }
    }
}
