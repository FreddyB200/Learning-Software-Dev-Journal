package control_structures;

public class WhileLoops {
    public static void main(String[] args) {

//        int countdown = 10;
//        while (countdown>0) {
//            System.out.println(countdown);
//            countdown--;
//        }
//        System.out.println("Happy new year!");
//
//        int dice = 1;
//
//        while (dice <= 6) {
//            if (dice < 6) {
//                System.out.println("No Yatzy.");
//            } else {
//                System.out.println("Yatzy!");
//            }
//            dice++;
//        }
//
//        int i = 0;
//         do {
//             System.out.println(i);
//             i++;
//         } while (i<5);

        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
            if (x == 4) {
                break;
            }
        }
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        }

}
