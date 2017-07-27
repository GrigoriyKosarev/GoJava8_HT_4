import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {

        System.out.println("---Задание 1-----------------------------");
        int x = 5;
        countToMAXNumber(x);

        System.out.println("---Задание 2-----------------------------");
        /*Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
        Аргументы функции: ширина прямугольника в символах, высота прямоугольника в символах*/
        drawRectangle("3", "2");

        System.out.println("---Задание 3-----------------------------");
        /*Перегрузить функцию drawRectangle (задание 2) таким образом, что бы она могла принимать
        на вход только 1 параметр (ширина квадрата) и рисовать квадрат с равными сторонами*/
        drawRectangle("3");

        System.out.println("---Задание 4-----------------------------");

    }

    public static void countToMAXNumber(int maxInt){

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

    public static void drawRectangle(String width, String heigh){

        int widtheRectangle = Integer.parseInt(width);
        int heighRectangle = Integer.parseInt(heigh);

        for (int i = 0; i < heighRectangle; i++){
            for (int j = 0; j < widtheRectangle; j++){
                System.out.print("+");
            }
            System.out.println("");
        }

    }

    public static void drawRectangle(String width){

        int widtheRectangle = Integer.parseInt(width);

        for (int i = 0; i < widtheRectangle; i++){
            for (int j = 0; j < widtheRectangle; j++){
                System.out.print("+");
            }
            System.out.println("");
        }

    }

}
