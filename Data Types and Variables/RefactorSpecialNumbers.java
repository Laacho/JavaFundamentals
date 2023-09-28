package fundamentalsDay8;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

           int num = i;
           int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            boolean isSpecial = sum == 5 || sum == 7 || sum == 11;
            if(isSpecial)
                System.out.printf("%d -> %s%n",i,"True");
            else System.out.printf("%d -> %s%n",i,"False");
        }
    }
}
