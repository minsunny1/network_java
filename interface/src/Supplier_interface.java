// 함수형 인터페이스: 1개의 추상메서드를 갖고 있는 인터페이스
// 람다식은 함수형 인터페이스로만 접근 가능

import java.util.function.*;
import java.util.*;
import java.text.*;

// 람다식 안에 들어가는 함수형 인터페이스 종류:
// Supplier<T> : 인자를 받지 않고 T타입의 객체를 리턴
// => get()
// Consumer<T> c = t -> {T타입 t객체를 사용 후 void 반환하는 실행문}
// => accept(), andThen()
// function
// operator
// Predicate<T> p = t -> {T타입의 t객체를 논리값(boolean)으로 반환하는 실행문}
// => test(), and(), or(), isEqual()
public class Supplier_interface {
    public static void main(String[] args)
    {
        Supplier<String> s1 = () -> "apple";
        System.out.println(s1.get());

        int[] x = {0};
        IntSupplier s2 = () -> x[0]++;
        for (int i=0; i<3; i++)
            System.out.println(s2.getAsInt());

        DoubleSupplier s3 = () -> Math.random() * 10;
        System.out.println(s3.getAsDouble());

        SimpleDateFormat format = new SimpleDateFormat("MM월 dd일(E요일) a hh:mm:ss");

        Supplier<String> s4 = () -> format.format((new Date()));
        System.out.println(s4.get());
    }

}
