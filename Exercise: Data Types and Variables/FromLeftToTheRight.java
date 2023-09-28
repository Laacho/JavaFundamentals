package fundamentalsDay9;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String number= scanner.nextLine();
            String left="",right="";
            int sreda=0;
            for (int j = 0; j < number.length(); j++) {
                if(number.charAt(j)==' ')
                {sreda=j;
                    break;}
                left+=number.charAt(j);
            }
            for (int j = sreda+1; j < number.length(); j++) {
                right+=number.charAt(j);
            }
            long leftL=Long.parseLong(left);//-120
            long rightL=Long.parseLong(right);//-10
            if(leftL>rightL)
            {
                leftL=Math.abs(leftL);
                long sum=0;
                while (leftL>0)
                {
                    sum+=leftL%10;
                    leftL/=10;
                }
                System.out.println(sum);
            }
            else
            {
                rightL=Math.abs(rightL);
                long sum=0;
                while (rightL>0)
                {
                    sum+=rightL%10;
                    rightL/=10;
                }
                System.out.println(sum);
            }

        }
    }
}
