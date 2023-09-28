package fundamentalsDay9;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int numberSnowballs=Integer.parseInt(scanner.nextLine());
        double max=Double.MIN_VALUE;
        int qualityres=Integer.MIN_VALUE;
        int timeres=Integer.MIN_VALUE;
        int snowres=Integer.MIN_VALUE;
        for (int i = 0; i < numberSnowballs; i++) {
            int snowballSnow=Integer.parseInt(scanner.nextLine());
            int snowballTime=Integer.parseInt(scanner.nextLine());
            int snowballQuality=Integer.parseInt(scanner.nextLine());

            double snowballValue=Math.pow(snowballSnow / snowballTime ,snowballQuality);
            if(max<snowballValue)
            {
                max=snowballValue;
                qualityres=snowballQuality;
                timeres=snowballTime;
                snowres=snowballSnow;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)",snowres,timeres,max,qualityres);
    }
}
