import java.util.Scanner;

/**
 * Created by admin on 27.07.2017.
 */
public class Functions {

    public static void main(String[] args) {

        //---Задание 1-----------------------------
        int x = 5;
        countToMAXNumber(x);

        /*---Задание 2-------------------------------------
        Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
        Аргументы функции: ширина прямугольника в символах, высота прямоугольника в символах*/


    }

    public static String countToMAXNumber(int maxInt){

        // Базовый случай
        if (maxInt == 1) {
            System.out.println(maxInt);
            return "1";
        }
        // Шаг рекурсии / рекурсивное условие
        countToMAXNumber(maxInt - 1);

        System.out.println(maxInt);

        return "1";
    }


}
