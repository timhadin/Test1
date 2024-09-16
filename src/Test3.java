import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int A;
        int B;

        System.out.print("정수 A : ");
        A = sc.nextInt();
        System.out.print("정수 B : ");
        B = sc.nextInt();

        int start = Math.min(A, B);
        int end = Math.max(A, B);

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
