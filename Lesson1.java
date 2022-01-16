class Lesson1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign(){
        int a = 1;
        int b = 2;
        int c = (a + b);
        if ( c >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    static void printColor(){
        int value = 120;
        if ( value <= 0) {
        System.out.println("Красный");
        }
        if ( value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if ( value > 100) {
            System.out.println("Зеленый");
        }
    }
    static void compareNumbers(){
        int a = 5;
        int b = 2;
        if ( a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}