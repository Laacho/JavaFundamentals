package fundamentalsDay9;

import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double first=Double.parseDouble(scanner.nextLine());
        double second=Double.parseDouble(scanner.nextLine());

        double result=0;
        if(first>second)
        { first=Math.abs(first);
             result=first-second;
        }
        else {
            second=Math.abs(second);
             result=second-first;
        }


        if(result<0.000001)
            System.out.println("True");
        else System.out.println("False");
    }
}
//-4.999999
//-4.999998