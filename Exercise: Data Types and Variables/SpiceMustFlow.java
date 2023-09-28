package fundamentalsDay9;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int startYeild=Integer.parseInt(scanner.nextLine());//111
        int dayCount=0;
         int total=0;
        if (startYeild >= 100) {
            while (startYeild >= 100) {
               int finalY = startYeild - 26;
                total += finalY;
                dayCount++;
                startYeild -= 10;

            }
            total -= 26;
        }
        System.out.println(dayCount);
        System.out.println(total);
    }
}
