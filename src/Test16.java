import java.util.Scanner;

public class Test15_4 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는?:");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
                for (int k = i; k <= num; k++) {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
