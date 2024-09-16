import java.util.Scanner;

public class Test4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("카운트다운 합니다.");
        int num;

        while (true) {
            System.out.print("양의 정숫값:");
            num = sc.nextInt();

            if (num >= 0)
                break;
        }

        while (num >= 0) {
            num--;
            System.out.println(num);
        }
        System.out.printf("x의 값이%d이 됐습니다.", num);
    }
}