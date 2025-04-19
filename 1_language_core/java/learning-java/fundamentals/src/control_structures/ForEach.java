package control_structures;

public class ForEach {
//    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (String i: cars) {
//        System.out.println(i);
//    }
//    int[] myNumbers = {1, 2, 3, 4, 5};
//    //first way
//        for (int i: myNumbers){
//        System.out.println(i);
//    }
//    //second way
//        for (int i = 0; i<myNumbers.length; i++) {
//        System.out.println(myNumbers[i]);
//    }
//    Real-Life Examples
//        for(int i = 0; i <=100; i+=10) {
//        System.out.println(i);
//    }
//        for(int i = 0; i <=10; i+=2) {
//        System.out.println(i);
//    }
//    int number = 2;
//        for(int i = 1; i <=10; i++) {
//        System.out.println(number + " x " + i + " = " + (number * i));
//    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

    }
}

