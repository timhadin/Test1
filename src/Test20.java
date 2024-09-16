import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("2이상의 정숫값:");
            num = sc.nextInt();
            if (num >= 2)
                break;
        }

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num; j++) {

            }
        }
    }
}