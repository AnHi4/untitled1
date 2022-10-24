/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Test29 {
    public static void main(String[] args) {
       int[] nums = {1, 2, 3, 8, 46, 65, 85, 5, 45};
        for (int i = 0; i < nums.length; i++) {
            String check = nums[i] == 5? "'да'" : "'нет'";
            System.out.println(check);
        }
    }
}

