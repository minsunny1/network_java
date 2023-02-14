import java.util.function.*;
public class Predicate_interface {
    public static void main(String[] args)
    {
        IntPredicate even = x -> x%2 == 0;
        System.out.println(even.test(3) ? "짝수" : "홀수");

        IntPredicate one = x -> x == 1;
        IntPredicate oneOrEven = one.or(even); // or()은 둘 중에 하나만 true면 true
        System.out.println(oneOrEven.test(1) ? "1 혹은 짝수" : "1이 아닌 홀수");

        Predicate<String> p = Predicate.isEqual("lambda");
        System.out.println(p.test("lambda"));
        System.out.println(p.test("llll"));

        // 두개의 매개변수 사용
        BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
        System.out.println(bp.test(2, 3));
    }
}
