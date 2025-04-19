package methods;

public class ScopePractice {
    int instanceCounter = 15;

    public void incrementCounter(){
        int localCounter = 0;
//        for (int i = 0; localCounter < 10; i++){
//            localCounter += 1;
//            System.out.println("local counter inside loop: " + localCounter);
//        }
        while (localCounter < 10){
            localCounter += 1;
            System.out.println("local counter inside loop: " + localCounter);
        }
        System.out.println("Final local variable: " + localCounter);
        System.out.println("Instance variable: " + this.instanceCounter);
    }

    public static void main(String[] args) {
        ScopePractice practice = new ScopePractice();
        practice.incrementCounter();
    }
}
