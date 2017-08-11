import java.util.Scanner;

public class Functions {

    public static int iRecursia = 0;

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
        drawRectangleRecursia(3, 3);
        System.out.println("");

        System.out.println("---Задание 7-----------------------------");
        /*Написать программу, в которой выполнены все шесть предыдущих заданий. Каждое задание выполняется в отдельной
        функции. В пределах этой же функции происходит ввод с консоли необходимых данных. Программа спрашивает
        пользователя какую задачу он хочет решить (от 1 до 6). Затем программа вызывает соответствующую функцию
        для решения этой задачи. По окончанию решения задачи, программа спрашивает пользователя, хочет ли он продолжить
        решать задачи. Если да - опять спрашивает какую задачу.*/
        allTasksInOne();

    }

    public static void allTasksInOne(){

        int result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Какую зачачу хотите решыть? (введите число):");
        System.out.println("- Задание 1");
        System.out.println("- Задание 2");
        System.out.println("- Задание 3");
        System.out.println("- Задание 4");
        System.out.println("- Задание 5");
        System.out.println("- Задание 6");

        result = sc.nextInt();
        if (result == 1){
            countToMAXNumber(5);
        }
        else if (result == 2){
            drawRectangle("3", "2");
        }
        else if (result == 3){
            drawRectangle("3");
        }
        else if (result == 4){
            System.out.println("max = " + getMax(2, 3));
            System.out.println("max = " + getMax(2.0F, 3.3F));
        }
        else if (result == 5){
            countToMAXNumber(5);
        }
        else if (result == 6) {
            drawRectangleRecursia(3, 3);
        }

        System.out.println("");
        System.out.println("Ещё хотите решыть зачачу (yes/no)?");
        Scanner in = new Scanner(System.in);

        String resultAnswear = in.nextLine();
        boolean resultYes = new String(resultAnswear).equals("yes");
        if(resultYes){
            allTasksInOne();
        }
        else {
            return;
        }
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

    public static void drawRectangleRecursia(int x, int y) {

        //Перегрузить функцию drawRectangle (задание 2) таким образом, что бы она могла принимать на вход только
        // 1 параметр (ширина квадрата) и рисовать квадрат с равными сторонами

        if ((x == 0) && (y == 1)) return; //
        if (x != 0){ // рухаємось по рядку поки не добігаєм його кінця
            iRecursia++; // збільшуєм лічильник пройдених символів у рядку (в кінці зрівнюється з шириною рядка)
            System.out.print("x ");
            drawRectangleRecursia(x-1, y); // пересуваємось на 1 позицію в рядку
        } else { // інакше (при досягненні кінця рядка) перескакуєм на наступний рядок
            System.out.println(); // перескакуєм на наступний рядок
            x = iRecursia; // зберігаєм ширину рядка для майбутнього проходження
            iRecursia = 0; // обнуляємо лічильник пройдених символів у рядку
            drawRectangleRecursia(x, y-1); // зменшуєм кількість рядків на 1
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