public class Pikachu extends Pokemon{
    private String name = "피카츄";
    public Pikachu(String owner, String skills){
        super(owner, skills);
    }
    @Override
    public void attack(int idx){
        System.out.printf("%s의 %s가 %s 공격 시전\n", this.owner, name, this.skills.get(idx));
        System.out.println("[삐까삐까]" + this.owner + "의 " + name + "가" + this.skills.get(idx) + "공격 시전!");
    }
}
