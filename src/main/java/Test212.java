/*
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/
public class Test212 {
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