package control_structures;

public class IfElse {
    public static void main(String[] args) {
        int age  = 18, time = 20, minimunAge = 18;

        //if-statement way 1
        if (time < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }
        //if-statement way 2
        String result = (age < minimunAge) ? "Access not allowed" : "Welcome";
        System.out.println(result);

        //Real-life Examples
        //1.
        int doorCode = 1337;
        if (doorCode == 1337) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed.");
        }

        //2.
        int myNum = 10; // Is this a positive or negative number?
        if (myNum > 0) {
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }

        //3.
        int myAge = 17;
        int votingAge = 18;
        String enableTovote = (myAge >= votingAge) ? "Old enough to vote!" : "Not old enough to vote.";
        System.out.println(enableTovote);

        //4.
        int myNumber = 5;
        if (myNumber % 2 == 0) {
            System.out.println(myNumber + " is even");
        } else {
            System.out.println(myNumber + " is odd");


            //switch
            int day = 4;
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
        }
    }
}
