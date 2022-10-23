//Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b.
// Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
//     Переменные взять от себя и рассмотреть обе ситуции.

import java.util.Scanner;

public class Test26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String result = (a % b == 0)? "'Делится' " + a / b : "'Делится с остатком' " + a % b;
        System.out.println(result);
    }
}

