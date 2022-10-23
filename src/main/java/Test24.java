/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно.
Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cashInt = scanner.nextInt();
        int percentInt = scanner.nextInt();
        //  System.out.println((float) cashInt * (float) percentInt);
        float cashFloat = cashInt;
        float percentFloat = 1 + (float) percentInt / 100;
        System.out.println("При капитализации процентов:");
        for (int i = 1; i <= 5; i++) {
            float income = ((cashFloat * percentFloat) - cashFloat);
            cashFloat = cashFloat * percentFloat;
            System.out.println("Через " + i + " год/года/лет будет: " + cashFloat);
            System.out.println("Прирост составил: " + income);
        }

        System.out.println();
        System.out.println("Без капиализации процентов: ");
        cashFloat = cashInt;
        percentFloat = percentInt;
        for (int i = 1; i <= 5; i++) {
            cashFloat = cashFloat + percentFloat;
            System.out.println("Через " + i + " год/года/лет будет: " + cashFloat);
            System.out.println("Прирост составил: " + percentInt);
        }
    }
}

