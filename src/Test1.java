import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        boolean bo = true;
        Scanner sc = new Scanner(System.in);

        while(bo) {
            System.out.print("세 자리의 정숫값:");
            int num = sc.nextInt();
            if (num>=100 && num<1000) {
                System.out.printf("입력한 값은 %d입니다.%n", num);
                bo = false;
            }
        }
    }
}