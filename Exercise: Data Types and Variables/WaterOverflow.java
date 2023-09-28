package fundamentalsDay9;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        int lines=Integer.parseInt(scanner.nextLine());//5
        int liters=0;
        for (int i = 0; i < lines; i++) {
            int temp=Integer.parseInt(scanner.nextLine());//10
            liters+=temp;
            if(liters>255)//
            {System.out.println("Insufficient capacity!");
                liters-=temp;
            }

        }

        System.out.println(liters);
    }
}
