/* 
   9. Сила тяжести на луне около 17% земной. Напишите программу, которая вычислила бы 
   ваш вес на Луне.
*/

package gravity_on_the_moon;

public class Gravity_on_the_moon {
    public static void main(String[] args) {
        double man_weight, mans_weight_on_the_moon;
        man_weight = 84.5;
        mans_weight_on_the_moon = 84.5 * 0.17;
        System.out.println("Вес человека на Земле равен " + man_weight + " кг");
        System.out.println("Вес человека на Луне равен " + mans_weight_on_the_moon + " кг");
    }
}
