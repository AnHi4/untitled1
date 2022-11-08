import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Varargs {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив");
        System.out.println("Введите что-то кроме числа, если массив завершен");
        while (scanner.hasNextInt()){
            list.add(scanner.nextInt());
        }
        int[] array = new int[list.size()];
        Arrays.setAll(array, list::get);
        testVarArgs(array);
    }

    static void testVarArgs(int... array) {
        System.out.print("Ваш массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        System.out.println("Ваш отсортированный массив: " + Arrays.toString(array));
        double median;
        if (array.length % 2 == 0) {
            median = ((array[array.length / 2] + array[array.length / 2 - 1]) / 2);
        }
        else
            median = array[array.length / 2];
        System.out.println(median);
    }
}