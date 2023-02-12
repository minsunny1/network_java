import java.util.List;

public class Pikachu extends Pokemon{
    private String name = "피카츄";
    public Pikachu(String powner, List<String> pskills){
        owner = powner;
        skills = pskills;
    }
    public void attack(int idx){
        System.out.printf("%s의 %s가 %s 공격 시전", owner, name, skills.get(idx));
    }
}
