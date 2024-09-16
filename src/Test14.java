import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("정방형을 표시합니다.");
        System.out.print("단수는:");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j <= num; j++) {
                System.out.print("*");
                for (int k = num; k <= num; k++) {
                    System.out.println("*");
                }
            }
        }
    }
}
