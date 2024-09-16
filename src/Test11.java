import java.util.Scanner;

public class Test10_2 {
    public static void main(String[] args) {

        int num;
        int hap = 0;

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            hap = hap + i;
            System.out.print(i);

            if (i < num) {
                System.out.print(" + ");
            }
        }
        System.out.printf(" = %d", hap);
    }
}
