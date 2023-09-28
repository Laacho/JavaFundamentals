package fundamentalsDay6;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //3451
       String number= scanner.nextLine();
       char ch;
       int sum=0;
        for (int i = 0; i < number.length(); i++) {
            ch=number.charAt(i);//3-string
            sum=sum+factorial(Character.getNumericValue(ch));
        }
        if(sum==Integer.parseInt(number))
            System.out.println("yes");
        else System.out.println("no");
    }
    public static int factorial(int chislo)
    {
        int result=1;
        for (int i = chislo; i >0 ; i--) {
            result=result*i;
        }
        return result;
    }
}
