import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {

        int[] nums = new int[3];

        Scanner sc = new Scanner(System.in);

        System.out.print("몇 cm부터:");
        nums[0] = sc.nextInt();
        System.out.print("몇 cm까지:");
        nums[1] = sc.nextInt();
        System.out.print("몇 cm 단위:");
        nums[2] = sc.nextInt();
        System.out.println("신장 표준 체중");
        System.out.println("------------");

        for (int i = 0; i <= (nums[1] - nums[0])/nums[2]; i++) {
            int j = nums[0] + i * nums[2];
            double kg = (j - 100) * 0.9;
            if (j == nums[2])
                break;
            System.out.printf("%d %-3.1f%n", j, kg);
        }
    }
}
