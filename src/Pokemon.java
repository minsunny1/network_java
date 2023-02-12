import java.util.List;

public abstract class Pokemon {
    protected String owner;
     List<String> skills;

    public void info() {
        System.out.printf("%s의 포켓몬이 가진 스킬", this.owner);
        // for skill in this.skills
    }
    public void attack(int idx){
        System.out.printf("%s 공격 시전!",
                skills.get(idx));
    }
}