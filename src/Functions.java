import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {

        System.out.println("---Задание 1-----------------------------");
        /*Написать функцию которая считает в консоли до числа Х. Аргументы функции: число Х*/
        countToMAXNumber(5);

        System.out.println("---Задание 2-----------------------------");
        /*Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
        Аргументы функции: ширина прямугольника в символах, высота прямоугольника в символах*/
        drawRectangle("3", "2");

        System.out.println("---Задание 3-----------------------------");
        /*Перегрузить функцию drawRectangle (задание 2) таким образом, что бы она могла принимать
        на вход только 1 параметр (ширина квадрата) и рисовать квадрат с равными сторонами*/
        drawRectangle("3");

        System.out.println("---Задание 4-----------------------------");
        /*Написать функцию getMax которая принимает на вход два аргумента в виде чисел. А возврыщает максимальное из этих двух.
        Так же, необходимо перегрузить эту функцию для работы с разными числовыми типами переменных (int, float)*/
        System.out.println("max = " + getMax(2, 3));
        System.out.println("max = " + getMax(2.0F, 3.3F));

        System.out.println("---Задание 5-----------------------------");
        //готово

        System.out.println("---Задание 6-----------------------------");
        /*РЕКУРСИЯ. Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
        Аргументы функции: ширина прямугольника в символах, высота прямоугольника в символах*/
        drawRectangleRecursia(3, 2);

    }

    public static void countToMAXNumber(int maxInt) {

        // Базовый случай
        if (maxInt == 1) {
            System.out.println(maxInt);
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        countToMAXNumber(maxInt - 1);

        System.out.println(maxInt);

        return;
    }

    public static void drawRectangleRecursia(int width, int heigh) {

        if (drawRaw(width) == 1){
            System.out.println("");
            heigh--;
        }
        if (heigh == 0){
            return;
        }
        else{
            drawRectangleRecursia(width, heigh);
        }

    }

    public static int drawRaw(int width){

        if (width == 0){
            return 0;
        }
        else {
            width--;
        }
        drawRaw(width);
        System.out.print("+");

        return 1;

    }



    public static void drawRectangle(String width, String heigh) {

        int widtheRectangle = Integer.parseInt(width);
        int heighRectangle = Integer.parseInt(heigh);

        for (int i = 0; i < heighRectangle; i++) {
            for (int j = 0; j < widtheRectangle; j++) {
                System.out.print("+");
            }
            System.out.println("");
        }

    }

    public static void drawRectangle(String width) {

        int widtheRectangle = Integer.parseInt(width);

        for (int i = 0; i < widtheRectangle; i++) {
            for (int j = 0; j < widtheRectangle; j++) {
                System.out.print("+");
            }
            System.out.println("");
        }

    }

    public static int getMax(int a, int b) {

        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        }
        return 0;
    }

    public static float getMax(float a, float b) {

        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        }
        return 0;
    }
}