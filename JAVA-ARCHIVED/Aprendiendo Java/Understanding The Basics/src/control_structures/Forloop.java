package control_structures;

public class Forloop {
    public static void main(String[] args) {
        for (int i = 0;i < 5;i++) {
            System.out.println(i);
        }

        for(int i = 1;i <= 2;i++) {
            System.out.println("Outer: " + i);


            for(int j =1; j<=3; j++) {
                System.out.println(" Inner: "+j);
            }
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "," + j + " ");
            }
        }
    }
}
