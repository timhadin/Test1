import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 피라미드를 표시합니다.");
        System.out.print("단수는?:");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            // num을 3이라고 했을 때 i가 1-2-3 늘어나는 동안 k는 1이하, 3이하, 5이하 true
            for (int k = 1; k <= (2 * i -1); k++) {
                // k가 true 일때 i를 출력해서 같은 숫자 반복
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
