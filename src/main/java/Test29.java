/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Test29 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] ==5){
                System.out.println("да");
                break;
            }
            else System.out.println("нет");
        }
    }
}
