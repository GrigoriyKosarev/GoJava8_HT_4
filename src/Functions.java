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
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
