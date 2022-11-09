import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {12.5, 4.8, -9.74, 56.4, -7.5, 6.8, -6.2, -5.5, 5.9, 7.8, 1.2, -5.2, 4.3, -8.5, -3.4};
        double result = 0;
        int sum = 0;
        boolean proverka = false;
        for (double num : numbers) {
            if (num < 0) {
                proverka = true;

            } else if (num > 0 && proverka) {
                result += num;
                sum++;
                System.out.println(num);
            }
        }
        System.out.println("Значение среднего арифметического числа равна: " + result / sum);

    }
}
