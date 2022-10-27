/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить,
чтобы в сумме получилось больше 10-ти.
*/

public class Test211 {
    public static void main(String[] args) {
        int nums[] = {3, 2, 4, 2, 4};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (10 > sum) {
                System.out.println(i + 2);
            }
        }
    }
}