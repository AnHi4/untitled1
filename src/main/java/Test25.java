//Задание: Запросить у пользователя ввод числа и сохранить это число в переменную a.
// Если переменная a равна 10, то выведите 'Верно', иначе выведите 'Неверно'.

import java.util.Scanner;

public class Test25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scanned = scanner.nextInt();
        String result = (scanned == 10) ? "'Верно'" : "'Неверно'";
        System.out.println(result);
        //   variable = (condition) ? expressionTrue :  expressionFalse;
    }
}

