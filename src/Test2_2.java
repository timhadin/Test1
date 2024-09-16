import java.util.Scanner;

public class Test2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        final int ANSWER = 50;
        final int MAX = 5;

        int TRY = 0;

        System.out.println("숫자 맞추기 게임 시작!");
        System.out.println("0부터 99사이의 숫자를 맞추세요. (총 기회는 다섯 번입니다.)");

        while (TRY < MAX) {
            System.out.print("어떤 숫자일까?: ");
            num = sc.nextInt();
            TRY++;

            if (num < ANSWER) {
                System.out.println("더 큰 숫자입니다.");
            } else if (num > ANSWER) {
                System.out.println("더 작은 숫자입니다.");
            } else {
                System.out.println("정답입니다!");
                break;
            }

            if (TRY >= MAX) {
                System.out.println("횟수 초과! 정답은: " + ANSWER);
            }
        }
    }
}