/*
Задание: Дано число, например 31.
Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы.
То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30.
Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/
//import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Test27 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // Scanner scanner = new Scanner(System.in);
        //int num = scanner.nextInt();
        int num = 32;
        for(int i = 2;i < num; i++){
            int modulus = num % i;
            if(modulus>0){
                set.add("'false'");
            }
            else set.add("'true'");
        }
        if (set.contains("'true'")){
            System.out.println("'true'");
        }
        else System.out.println("'false'");
    }
}

