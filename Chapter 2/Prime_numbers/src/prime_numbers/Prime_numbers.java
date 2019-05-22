/*
        10. Напишите программу, которая находила бы все простые
    числа в диапазоне от 2 до 100.
*/
package prime_numbers;

public class Prime_numbers {
    public static void main(String[] args) {
        int i, j, temp;
        System.out.println("Список простых чисел: ");
        for (i = 2; i <= 100; i++) {
            temp = 0;
            for (j = 2; j < i; j++) {
                if ((i % j) == 0)
                    temp++;
            }
            if (temp == 0) // Вывод простых чисел на экран, если не нашлось делителя без остатка
                 System.out.print(i + ", ");
        }
    }
}
