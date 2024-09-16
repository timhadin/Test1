import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {

        int num;
        int hap = 0;

        System.out.print("1부터 n까지의 합을 구합니다.n의 값:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            hap = hap + i;
        }
        System.out.printf("1부터 %d까지의 합은 %d입니다.", num, hap);
    }
}
