import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pokemon p;
        while (true) {
            System.out.println("총 마리의 포켓몬이 생성되었습니다.");
            System.out.printf("총 %d마리의 포켓몬이 생성되었습니다.\n", Pokemon.count);
            System.out.print("1) 포켓몬 생성 2) 프로그램 종료 : ");
            String menu = in.nextLine();
            if (menu.equals("2")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (menu.equals("1")) {
                System.out.print("pokemon = 1) 피카츄 2) 꼬부기 3) 파이리 : ");
                String monster = in.nextLine();
                System.out.print("플레이어 이름 입력: ");
                String n = in.nextLine();
                System.out.print("사용 가능한 기술 입력 (/로 구분): ");
                String s = in.nextLine();
                if (monster.equals("1")) {
                    p = new Pikachu(n, s);
                } else if (monster.equals("2")) {
                    p = new Ggoboogi(n, s);
                } else if (monster.equals("3")) {
                    p = new Pairi(n, s);
                } else {
                    System.out.println("메뉴에서 골라 주세요");
                    continue;
                }
                p.info();
                System.out.print("공격 번호 선택: ");
                String attack_menu = in.nextLine();
                p.attack(Integer.parseInt(attack_menu)-1);
            } else{
                System.out.println("메뉴에서 골라주세요.");
            }
        }
    }
}

