package fundamentalsDay8;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        String bukva=scanner.nextLine();

        if(bukva.equals(bukva.toUpperCase()))
        System.out.println("upper-case");
        else System.out.println("lower-case");
    }
}
