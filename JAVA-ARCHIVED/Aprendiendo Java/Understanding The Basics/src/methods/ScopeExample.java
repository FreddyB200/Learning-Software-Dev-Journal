package methods;

public class ScopeExample {
    int instanceVar = 10; //class scope
    static int classVar = 20;

    public void myMethod() {
        int localVar = 20; //method scope

        if (true) {
            int blockVar = 30; //Block scope
            System.out.println("block variable: " + blockVar);
            System.out.println("local variable: " + localVar);
            System.out.println("instance variable: " + instanceVar);
        }
        // System.out.println("block variable: " + blockVar); no es accesible
        System.out.println("local variable: " + localVar); //accesible
        System.out.println("instance variable: " + instanceVar); //accesible
    }

    public static void main(String[] args) {
        ScopeExample example = new ScopeExample();
        example.myMethod();
    }
}
