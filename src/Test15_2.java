import java.util.Scanner;

public class Test15_1 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는?:");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print("*");
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
