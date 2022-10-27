/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Test210 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 9, 9, 4};
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.println("да");
                break;
            } else System.out.println("нет");
        }
    }
}