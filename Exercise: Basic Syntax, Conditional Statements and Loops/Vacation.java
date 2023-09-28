package fundamentalsDay6;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int group=Integer.parseInt(scanner.nextLine());
        String typeGroup= scanner.nextLine();
        String day= scanner.nextLine();
        double price=0;

        switch (typeGroup)
        {
            case "Students":
                if(day.equals("Friday"))
                    price=group*8.45;
                else if(day.equals("Saturday"))
                    price=group*9.80;
                else if(day.equals("Sunday"))
                    price=group*10.46;
                if(group>=30)
                    price=price-price*0.15;
                break;
            case "Business":
                if(group>=100)
                    group-=10;
                if(day.equals("Friday"))
                price=group*10.90;
            else if(day.equals("Saturday"))
                price=group*15.60;
            else if(day.equals("Sunday"))
                price=group*16;
                break;
            case "Regular":
                if(day.equals("Friday"))
                    price=group*15;
                else if(day.equals("Saturday"))
                    price=group*20;
                else if(day.equals("Sunday"))
                    price=group*22.5;
                if(group>=10 && group<=20)
                    price=price-price*0.05;
                break;
        }
        System.out.printf("Total price: %.2f",price);
    }
}
