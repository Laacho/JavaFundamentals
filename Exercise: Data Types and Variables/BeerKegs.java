package fundamentalsDay9;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        double max=Double.MIN_VALUE;
        String ans="";
        for (int i = 0; i < n; i++) {
            String name= scanner.nextLine();
            double radius=Double.parseDouble(scanner.nextLine());
            int height=Integer.parseInt(scanner.nextLine());
            double volume=Math.PI*Math.pow(radius,2)*height;
            if(max<volume)
            { ans=name;
                max=volume;
            }

        }
        System.out.println(ans);
    }
}
