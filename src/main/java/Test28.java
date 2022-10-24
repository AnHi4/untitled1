/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/
public class Test28 {
    public static void main(String[] args) {
        int result = 1;
       int[] nums = {2, 3, 4, 5};
       for (int i=0;i < nums.length;i++){
           result = result*nums[i];
           System.out.println(result);
       }
    }
}

