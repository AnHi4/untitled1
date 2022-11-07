import java.util.Arrays;
import java.util.Scanner;

public class Varargs {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        testVarArgs(nums);
    }

    static void testVarArgs(int... nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        Arrays.sort(nums);
        double median;
        if (nums.length % 2 == 0)
            median = ((double) nums[nums.length / 2] + (double) nums[nums.length / 2 - 1]) / 2;
        else
            median = nums[nums.length / 2];
        System.out.println(median);
    }
}