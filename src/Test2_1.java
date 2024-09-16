import java.util.Scanner;

public class Test2_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("숫자 맞추기 게임 시작!");
        System.out.println("10부터 99사이의 숫자를 맞추세요.");

        final int ANSWER = 50;

        do {
            System.out.print("어떤 숫자일까?:");
            num = sc.nextInt();

            if (num < ANSWER) {
                System.out.println("더 큰 숫자입니다.");
            } else if (num > ANSWER) {
                System.out.println("더 작은 숫자입니다.");
            }
        } while (num != ANSWER);

        System.out.println("정답입니다.");

        sc.close();
    }
}
