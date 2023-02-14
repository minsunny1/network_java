//import java.util.*; // util 디렉토리 안에 있는 모든 클래스 임포트
//public class Comparator_interface {
//    public static void main(String[] args){
//        // 자료형[] 변수 = {}
//        String[] strings = {"로마에 가면 로마법을 따르라.",
//        "시간은 금이다.", "펜은 칼보다 강하다."}; // 문자열 담을 수 있는 배열
//
//        // Comparator 인터페이스의 익명 구현 => 객체로서 문자열의 길이 비교
//        Arrays.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String first, String second) {
//                return first.length()-second.length(); // 오름차순 정렬
//            }
//        });
//
//        for (String s : strings)
//            System.out.println(s);
//    }
//}


// Lambda_version (->)
import java.util.Arrays; // util 디렉토리 안에 있는 모든 클래스 임포트
public class Comparator_interface {
    public static void main(String[] args){
        // 자료형[] 변수 = {}
        String[] strings = {"로마에 가면 로마법을 따르라.",
                "시간은 금이다.", "펜은 칼보다 강하다."}; // 문자열 담을 수 있는 배열

        // (타입 매개변수 -> {실행문; 실행문; ...})
        Arrays.sort(strings, (first, second) -> first.length() - second.length());

        for (String s : strings)
            System.out.println(s);
    }
}