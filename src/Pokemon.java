import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public abstract class Pokemon {
// abstract -> 추상클래스는 객체를 생성할 수 없음, 상속 전용으로 만들어진 클래스
    protected String owner;
    // 접근지정자 -> 자식클래스에서 setter, getter 없이 상속 받을 수 있음
     protected List<String> skills;
     public static int count = 0; // 정적 매서드

     public Pokemon(String owner, String skills){
         this.owner = owner;
         StringTokenizer st = new StringTokenizer(skills, "/");
         // StringTokenizer 클래스 -> 문자열을 구분자(delimiter)를 이용해 토큰(분리한 문자열)으로 분리
         this.skills = new ArrayList<>();
         // this.skills = new ArrayList<String>();
         // ArrayList의 type은 부모인 List를 따라가기 때문에 생략해도 된다
         while(st.hasMoreTokens()){ // return true or false
             this.skills.add(st.nextToken());
         }
         System.out.print("포켓몬 생성 : ");
         Pokemon.count = Pokemon.count + 1;
     }
    // override: 부모클래스의 함수를 자식클래스에서 재정의하는 것
    public void info() {
        int idx = 0;
        System.out.printf("%s의 포켓몬이 가진 스킬", this.owner);
        for(String skill : skills){
            System.out.println(++idx + " : " + skill); // 증가연산자
        }
    }
    public void attack(int idx){
        System.out.printf("%s 공격 시전!",
                this.skills.get(idx));
    }
}