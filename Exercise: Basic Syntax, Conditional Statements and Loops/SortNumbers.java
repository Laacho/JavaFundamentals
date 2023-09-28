package fundamentalsDay6;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number1=Integer.parseInt(scanner.nextLine());//-8
        int number2=Integer.parseInt(scanner.nextLine());//9
        int number3=Integer.parseInt(scanner.nextLine());//0
           int max=number1;
           if(max<number2 )
            max=number2;
       if(max<number3)
            max=number3;
        System.out.println(max);

        int min=number1;
        if(min>number2)
        min=number2;
         if(min>number3)
            min=number3;

        if(number1!=max && number1!=min)
            System.out.println(number1);
        else if(number2!=max && number2!=min)
            System.out.println(number2);
        else System.out.println(number3);

        System.out.println(min);

    }
}
