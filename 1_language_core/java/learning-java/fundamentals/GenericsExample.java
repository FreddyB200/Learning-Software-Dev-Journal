// Example: Using Generics in Java
public class GenericsExample<T> {
    private T value;
    public GenericsExample(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        GenericsExample<String> stringBox = new GenericsExample<>("Hello Generics");
        GenericsExample<Integer> intBox = new GenericsExample<>(42);
        System.out.println("String value: " + stringBox.getValue());
        System.out.println("Integer value: " + intBox.getValue());
    }
}
