import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개를 표시할까요?:");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print("+");
            } else if (i % 2 == 1) {
                System.out.print("*");
            }
        }
    }
}