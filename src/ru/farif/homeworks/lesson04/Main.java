package ru.farif.homeworks.lesson04;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ДЗ 04.1
        System.out.println("ДЗ 04.1");
        printText(3, "Hello world");
        System.out.println();

        //ДЗ 04.2
        System.out.println("ДЗ 04.2");
        int[] arrayNumber = new int[4];
        arrayNumber[0] = 2;
        arrayNumber[1] = 5;
        arrayNumber[2] = 7;
        arrayNumber[3] = -1;
        arraySum(arrayNumber);
        System.out.println();

        //ДЗ 04.3
        System.out.println("ДЗ 04.3");
        putNumberIn(3, 47);
        System.out.println();

        //ДЗ 04.4
        System.out.println("ДЗ 04.3");
        sumNumberIn(3, 2);
        System.out.println();

        //ДЗ 04.5
        System.out.println("ДЗ 04.3");
        halfSumPrint(2);
        System.out.println();


    }

    public static void printText(int numberForPrint, String text) {
        for (int i = 0; i < numberForPrint; i++) {
            System.out.println(text);
        }
    }


    public static void arraySum(int[] arrayArg) {
        int sum = 0;
        for (int i = 0; i <= arrayArg.length - 1; i++) {
            if (arrayArg[i] >= 5) {
                sum = sum + arrayArg[i];
            }
        }
        System.out.println(sum);
    }

    public static void putNumberIn(int numberForChange, int numberInForChange) {
        int[] arrayArgChange = new int[numberForChange];

        System.out.println("Введите целые числа: ");
        System.out.println("Важно!");
        System.out.println("Длина массива равна " + numberForChange);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= arrayArgChange.length - 1; i++) {
            int enterNumber = scanner.nextInt();
            arrayArgChange[i] = enterNumber;
        }
        System.out.println("Ура!!! Вы создали массив: ");
        System.out.println(Arrays.toString(arrayArgChange));

        for (int j = 0; j <= arrayArgChange.length - 1; j++) {
            arrayArgChange[j] = numberInForChange;
        }
        System.out.println("Шалость удалась");
        System.out.println(Arrays.toString(arrayArgChange));
    }

    public static void sumNumberIn(int numberForSum, int numberInForSum) {
        int[] arrayArgSum = new int[numberForSum];

        System.out.println("Введите целые числа: ");
        System.out.println("Важно!");
        System.out.println("Длина массива равна " + numberForSum);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= arrayArgSum.length - 1; i++) {
            int enterNumber = scanner.nextInt();
            arrayArgSum[i] = enterNumber;
        }
        System.out.println("Ура!!! Вы создали массив: ");
        System.out.println(Arrays.toString(arrayArgSum));


        for (int j = 0; j <= arrayArgSum.length - 1; j++) {
            arrayArgSum[j] = arrayArgSum[j] + numberInForSum;
        }
        System.out.println("Шалость удалась");
        System.out.println(Arrays.toString(arrayArgSum));

    }

    public static void halfSumPrint(int numberArrayHalf) {
        if(numberArrayHalf == 0) {
            System.out.println("В Java не существует способа создать массив без длины.");
            System.out.println("При создании массива нужно указать его длину,");
            System.out.println("чтобы определить необходимое количество памяти.");
            System.out.println("Directed by");
            System.out.println("ROBERT B. WEIDE");

        } else if  (numberArrayHalf % 2 != 0) {
            System.out.println("Длина массива - нечетное число. В задаче не предусмотрено!");
            System.out.println("Directed by");
            System.out.println("ROBERT B. WEIDE");
        } else {
            int[] arrayArgHalf = new int[numberArrayHalf];

            System.out.println("Введите целые числа: ");
            System.out.println("Важно!");
            System.out.println("Длина массива равна " + numberArrayHalf);
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i <= arrayArgHalf.length - 1; i++) {
                int enterNumber = scanner.nextInt();
                arrayArgHalf[i] = enterNumber;
            }
            System.out.println("Ура!!! Вы создали массив: ");
            System.out.println(Arrays.toString(arrayArgHalf));
            System.out.println();

            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < arrayArgHalf.length / 2; i++) {
                sum1 = sum1 + arrayArgHalf[i];
            }
            for (int j = arrayArgHalf.length / 2; j <= arrayArgHalf.length - 1; j++) {
                sum2 = sum2 + arrayArgHalf[j];
            }

            System.out.println("Информация по массиву: ");
            System.out.println("Длина массива: " + arrayArgHalf.length);
            System.out.println("Сумма первой половины массива: " + sum1);
            System.out.println("Сумма второй половины массива: " + sum2);
            System.out.println();

            if (sum1 > sum2) {
                System.out.println("Сумма первой половины массива побеждает в этом конкурсе: " + sum1);
            } else if (sum2 > sum1) {
                System.out.println("Сумма второй половины массива побеждает в этом конкурсе: " + sum2);
            } else {
                System.out.println("Побеждает дружба!");
                System.out.println("Сумма первой половины массива - " + sum1 + " равна " + "сумме второй половины массива - "
                        + sum2);
            }
        }
    }
}
