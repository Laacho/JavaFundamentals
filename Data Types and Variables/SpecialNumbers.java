package fundamentalsDay8;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    int n=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {

            int sum=0;
            int number=i;
            while (number!=0)
            {
              sum+=number%10;
              number=number/10;

            }
            boolean result=sum==5 || sum==7 || sum== 11;
            if(result)
                System.out.printf("%d -> %s%n",i,"True");
            else System.out.printf("%d -> %s%n",i,"False");

        }

    }
}
