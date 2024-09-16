import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("피라미드를 표시합니다.");
        System.out.print("단수는?:");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            // num에 3을 넣었을 때 i는 1-2-3 순으로 늘어나고 k의 조건식은 1이하, 3이하, 5이하 true 순으로 늘어난다.
            for (int k = 1; k <= (2 * i -1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
