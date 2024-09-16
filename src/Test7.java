import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {

        int num;
        int Count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정숫값의 자릿수를 표시합니다.");

        while (true) {
            System.out.print("양의 정숫값:");
            num = sc.nextInt();

            if (num >= 0)
                break;
        }

        while (num != 0) {
            num /= 10;
            Count++;
            }
        System.out.printf("입력한 숫자는 %d자리입니다.", Count);
        }
}