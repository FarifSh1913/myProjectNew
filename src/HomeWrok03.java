import java.util.Scanner;

public class HomeWrok03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        greetings();
        System.out.println("Введите число от 1 до 5");



        checkSign(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        selectColor();
        compareNumbers();
        System.out.println("Введите число от 1 до 5");
        System.out.println("Введите признак true или false");
        addOrSubtractAndPrint(scanner.nextInt(), scanner.nextInt(), scanner.nextBoolean());


    }
    public static void greetings (){
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }
    public static void checkSign(int a, int b, int c){
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительна");
        }
        else {
            System.out.println("Сумма отрицательна");
        }
    }
    public static void selectColor() {
        int data = 3;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 0;
        int b = 0;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
    public static void addOrSubtractAndPrint (int initValue, int data,boolean increment){
        if (increment = true){
            int sum = initValue + data;
            System.out.println(sum);
        }
        else {
            int dif = initValue - data;
            System.out.println(dif);
        }
    }
}


