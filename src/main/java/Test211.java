/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить,
чтобы в сумме получилось больше 10-ти.
*/

public class Test211 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 2, 2, 4};
        int sum = 0;
        int j = 1;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum < 10) {
                j++;
            }
        }
        System.out.println(j);
    }
}