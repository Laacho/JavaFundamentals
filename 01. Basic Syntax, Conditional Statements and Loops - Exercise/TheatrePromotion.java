package fundamentalsDay5;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String day= scanner.nextLine();
        int age=Integer.parseInt(scanner.nextLine());
    
        if(day.equals("Weekday")) {
            if (age >= 0 && age <= 18)
                System.out.println("12$");
            else if (age>18 && age <= 64)
                System.out.println("18$");
            else if (age>64 && age <= 122)
                System.out.println("12$");
            else System.out.println("Error!");
        }
        else if(day.equals("Weekend"))
        {if(age>=0 && age<=18)
                System.out.println("15$");
            else if(age>18 &&age<=64)
                System.out.println("20$");
            else if(age>64 && age<=122)
                System.out.println("15$");
            else System.out.println("Error!");
        }
        else if(day.equals("Holiday")) {
            if (age >= 0 && age <= 18)
                System.out.println("5$");
            else if (age>18 && age <= 64)
                System.out.println("12$");
            else if (age>64 && age <= 122)
                System.out.println("10$");
            else System.out.println("Error!");
        }


        if (age >= 0 && age <= 18){
            if(day.equals("Weekday"))
                System.out.println("12$");
            else if(day.equals("Weekend"))
                System.out.println("15$");
            else if(day.equals("Holiday"))
                System.out.println("5$");
        }
        else if (age>18 && age <= 64)
        {
            if(day.equals("Weekday"))
                System.out.println("18$");
            else if(day.equals("Weekend"))
                System.out.println("20$");
            else if(day.equals("Holiday"))
                System.out.println("12$");
        }
        else if (age>64 && age <= 122)
        {
            if(day.equals("Weekday"))
                System.out.println("12$");
            else if(day.equals("Weekend"))
                System.out.println("15$");
            else if(day.equals("Holiday"))
                System.out.println("10$");
        }
        else System.out.println("Error!");




    }
}
