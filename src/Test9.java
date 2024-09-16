import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {

        int num;
        int gob = 1;
        int i = 1;

        System.out.print("양의 정숫값:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

//        for (int i = 1; i <= num; i++) {
//            gob = gob * i;
//        }

        while (i <= num) {
            gob = gob * i;
            i++;
        }
        System.out.printf("1부터 %d까지의 곱은 %d입니다.", num , gob);
    }
}
