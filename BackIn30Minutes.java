package fundamentalsDay5;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hours=Integer.parseInt(scanner.nextLine());
        int min=Integer.parseInt(scanner.nextLine());
        min+=30;
        if(min>60)
        {
            hours+=1;
            min-=60;
            if(hours>23)
                hours=0;
        }

        System.out.printf("%d:%02d",hours,min);
    }
}
