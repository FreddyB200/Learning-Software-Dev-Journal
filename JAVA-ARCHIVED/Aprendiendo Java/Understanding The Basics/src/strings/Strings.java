package strings;

public class Strings {
    public static void main(String[] args) {
        //String text = new String("Hello World"); forma uno
        String text = "Hello World"; //forma dos mas simple

        //methods

        //replace word for other
        System.out.println(text.replace("Hello", "Bye"));

        //Measure the length of a word
        System.out.println(text.length());

        //text in upper case
        String lower = text.toUpperCase();
        //text in lower case
        String upper = text.toLowerCase();
        System.out.println("texto en mayusculas: "+ upper + "\ntext en minusculas: "+ lower);

        //
        System.out.println(text.startsWith("Bye"));
        System.out.println(text.endsWith("ld"));
        System.out.println(text.contains("Wo"));
        System.out.println(text.indexOf("Wo"));

        //String concatenation
        System.out.println(upper + " " + lower); //way 1
        upper = upper + " ";
        System.out.println(upper.concat(lower)); //way 2
    }
}
