/**
 * Java 1. Homework 2
 *
 * @author Andrey Z
 * @version 16.01.2022
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
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    static void positive_negative(int a) {
        if ( a < 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }
    static boolean number_truefalse(int a) {
        if ( a < 0) {
            return true;
        } else {
            return false;
        }
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