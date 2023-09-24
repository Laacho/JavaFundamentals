package fundamentalsDay5;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean isEven=true;
        while (isEven)
        {
            int n=Integer.parseInt(scanner.nextLine());
            if(n%2==0)
            {isEven=false;
                System.out.printf("The number is: %d",Math.abs(n));
            }
            else
                System.out.println("Please write an even number.");


        }
    }
}
