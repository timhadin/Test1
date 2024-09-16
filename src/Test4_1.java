import java.util.Scanner;

public class Test4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("카운트다운 합니다.");
        int num;
        int i;

        for (;;) {
            System.out.print("양의 정숫값:");
            num = sc.nextInt();

            if (num > 0)
                break;
        }

        for (i = num; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.printf("x의 값이%d이 됐습니다.", i);
    }
}