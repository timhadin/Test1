import java.util.Scanner;

public class Test5_1 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 *를 표시할까요?:");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
}