import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("정숫값:");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int a = i * i;
            System.out.printf("%d의 제곱은 %d입니다.\n", i, a);
        }
    }
}
