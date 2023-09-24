package fundamentalsDay5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int chislo=Integer.parseInt(scanner.nextLine());

//        for (int i = 1; i <=10 ; i++) {
//            System.out.printf("%d X %d = %d \n",chislo,i,chislo*i);
//
//        }
        int n=1;
        while (n<=10){
            System.out.printf("%d X %d = %d \n",chislo,n,chislo*n);
            n++;
        }

    }
}
