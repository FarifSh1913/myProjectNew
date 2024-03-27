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


    /*
   Метод,  принимающий в качестве аргумента целое число и строку, и печатающий в
   консоль строку указанное кол-во раз
    */
    public static void printText(int addedPrintValue, String text) {
        for (int i = 0; i < addedPrintValue; i++) {
            System.out.println(text);
        }
    }


    /*
  Метод,  принимающий в качестве аргумента целочисленный массив,
  сумирующий все элементы, значение которых больше 5,
  и печатающий полученную сумму в консоль
   */
    public static void arraySum(int[] arrayArg) {
        int sum = 0;
        for (int i = 0; i <= arrayArg.length - 1; i++) {
            if (arrayArg[i] >= 5) {
                sum = sum + arrayArg[i];
            }
        }
        System.out.println(sum);
    }

    /*
    Метод,  принимающий в качестве аргумента целое число
    и ссылку на целочисленный массив,
    Метод должен заполнить каждую ячейку массива указанным числом
   */
    public static void putNumberIn(int numberChange, int numberInChange) {
        int[] arrayArgChange = new int[numberChange];

        System.out.println("Введите целые числа: ");
        System.out.println("Важно!");
        System.out.println("Длина массива равна " + numberChange);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayArgChange.length; i++) {
            int enterNumber = scanner.nextInt();
            arrayArgChange[i] = enterNumber;
        }
        System.out.println("Ура!!! Вы создали массив: ");
        System.out.println(Arrays.toString(arrayArgChange));

        for (int j = 0; j <= arrayArgChange.length - 1; j++) {
            arrayArgChange[j] = numberInChange;
        }
        System.out.println("Шалость удалась");
        System.out.println(Arrays.toString(arrayArgChange));
    }

    /*
    Метод,  принимающий в качестве аргумента целое число
    и ссылку на целочисленный массив,
    увеличивающий каждый элемент массива на указанное чисо=ло
   */
    public static void sumNumberIn(int addedSumValue, int addedInSumValue) {
        int[] arrayArgSum = new int[addedSumValue];

        System.out.println("Введите целые числа: ");
        System.out.println("Важно!");
        System.out.println("Длина массива равна " + addedSumValue);
        Scanner scanner = new Scanner(System.in);
        int enterNumber;

        for (int i = 0; i < arrayArgSum.length; i++) {
            enterNumber = scanner.nextInt();
            arrayArgSum[i] = enterNumber;
        }
        System.out.println("Ура!!! Вы создали массив: ");
        System.out.println(Arrays.toString(arrayArgSum));


        for (int j = 0; j < arrayArgSum.length ; j++) {
            arrayArgSum[j] = arrayArgSum[j] + addedInSumValue;
        }
        System.out.println("Шалость удалась");
        System.out.println(Arrays.toString(arrayArgSum));

    }

    /*
   Метод,  принимающий в качестве аргумента целочисленный массив, и печатающий в
   консоль информацию о том, сумма элементов какой из половин массива больше
    */
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

            for (int i = 0; i <arrayArgHalf.length; i++) {
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
            for (int j = arrayArgHalf.length / 2; j < arrayArgHalf.length; j++) {
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
