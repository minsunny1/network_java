import java.util.function.Consumer;

public class Consumer_interface {
    public static void main(String[] args)
    {
        Consumer<String> c1 = x -> System.out.println(x.toLowerCase());
        c1.accept("Java Functional Interface");


    }
}
