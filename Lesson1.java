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
        System.out.println(c >= 0? "�㬬� ������⥫쭠�" : "�㬬� ����⥫쭠�");
    }
    static void printColor(){
        int value = 120;
        if ( value <= 0) {
        System.out.println("����");
        }
        if (value > 0 && value <= 100) {
            System.out.println("�����");
        }
        if (value > 100) {
            System.out.println("������");
        }
    }
    static void compareNumbers(){
        int a = 5;
        int b = 2;
        System.out.println(a >= b? "a>=b" : "a<b");
    }
}