/* 
    10. Видоизмените программу, созданную в упражнении 1.2, таким образом,
    чтобы она выводила таблицу переноса дюймов в метры. Выведите значения
    длины до 12 футов через каждый дюйм. После каждых 12 дюймов выведите
    пустую строку.
*/

package inches_to_meters;

public class Inches_to_meters_ex {
    public static void main(String[] args) {
        double meters;
        int count = 0;
        for (int inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37; // Один метр приблизительно равен 39.37 дюйма
            System.out.println(inches + " дюймам соответствует " + meters + " метров");
            count++;
            if (count % 12 == 0) System.out.println();
        }
    }
    
}
