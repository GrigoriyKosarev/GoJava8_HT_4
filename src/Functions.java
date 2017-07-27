import java.util.Scanner;

/**
 * Created by admin on 27.07.2017.
 */
public class Functions {

    public static void main(String[] args) {

        //---Задание 1-----------------------------
        System.out.println(countToMAXNumber(5, 1));

    }

    public static int countToMAXNumber(int maxInt, int i){

        if (maxInt == i){
            return i;
        }
        else{
            System.out.println(i);
            countToMAXNumber(5, i+1);
        }

        return maxInt;
    }
}
