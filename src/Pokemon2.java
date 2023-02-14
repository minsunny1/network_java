import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public abstract class Pokemon2 {
    private String owner; // public -> private로 변경하고 getter, setter 함수 사용
    private List<String> skills;
    public static int count = 0; // 정적 매서드

    public Pokemon2(String owner, String skills){
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

    // getter setter 단축키 : Alt + Insert
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
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
