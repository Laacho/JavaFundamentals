package fundamentalsDay9;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());
        int d=Integer.parseInt(scanner.nextLine());
        int result=((a+b)/c)*d;
        System.out.println(result);
    }
}
