import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("포켓몬 수: ");
            int num = in.nextInt();
            System.out.printf("총 %d마리의 포켓몬이 생성되었습니다.\n", num);
            System.out.println();
            System.out.print("1) 포켓몬 생성 2) 프로그램 종료 : ");
            String menu = in.nextLine();
            if (menu.equals("2")){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if(menu.equals("1")){
                System.out.print("pokemon = 1) 피카츄 2) 꼬부기 3) 파이리");
                String monster = in.nextLine();
                if (monster.equals("1")){
                    System.out.print("플레이어 이름 입력: ");
                    String n = in.nextLine();
                    System.out.print("사용 가능한 기술 입력 (/로 구분): ");
                    String s = in.nextLine();
                    Pikachu p = new Pikachu(n,s);
                }
                if (monster.equals("2")){
                    System.out.print("플레이어 이름 입력: ");
                    String n = in.nextLine();
                    System.out.print("사용 가능한 기술 입력 (/로 구분): ");
                    String s = in.nextLine();
                    Pikachu p = new Ggoboogi(n,s);
                }
                if (monster.equals("3")){
                    System.out.print("플레이어 이름 입력: ");
                    String n = in.nextLine();
                    System.out.print("사용 가능한 기술 입력 (/로 구분): ");
                    String s = in.nextLine();
                    Pikachu p = new Pairi(n,s);
                }
            } else{
                System.out.println("메뉴에서 골라 주세요");
            }
        }
    }
}
