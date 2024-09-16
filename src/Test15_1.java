import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는?:");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < num; j ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
