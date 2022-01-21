/**
 * Java 1. Homework 2
 *
 * @author Andrey Z
 * @version 22.01.2022
 */
class Lesson2 {
    public static void main(String[] args) {
        System.out.println(two_numbers(4, 15));
        positive_negative(-2);
        System.out.println(number_truefalse(-100));
        string_N_times("yeah",5);
        System.out.println(vysokosniy_god(2022));
    }
    static boolean two_numbers(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    static void positive_negative(int a) {
        System.out.println(a < 0? "negative" : "positive");
    }
    static boolean number_truefalse(int a) {
        return a < 0;
    }
    static void string_N_times(String word, int times) {
        for (int i = 0; i < times; i++){
            System.out.println(word);
        }
    }
    static boolean vysokosniy_god(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }
}