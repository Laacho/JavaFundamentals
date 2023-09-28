package fundamentalsDay6;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

       // 0.1, 0.2, 0.5, 1, and 2 coins

        String name= scanner.nextLine();
        double total=0;
        while (!name.equals("Start"))
        {
           double temp= Double.parseDouble(name);
           if(temp==0.1 || temp==0.2 || temp==0.5 || temp==1 || temp==2)
               total+=temp;
           else  System.out.printf("Cannot accept %.2f%n",temp);
        name=scanner.nextLine();
        }
        String krai=scanner.nextLine();
        //"Nuts", "Water", "Crisps", "Soda", "Coke"
        //2.0      0.7        1.5     0.8     1.0
        while (!krai.equals("End"))
        {
            switch (krai) {
                case "Nuts" : {
                    if(total<2.0)
                        System.out.println("Sorry, not enough money");
                    else
                    {
                        total -= 2.0;
                        System.out.println("Purchased Nuts");
                    }
                };break;
                case "Water" : {
                    if(total<0.7)
                        System.out.println("Sorry, not enough money");
                    else
                    {
                        System.out.println("Purchased Water");
                        total -= 0.7;
                    }
                };break;
                case "Crisps" : {
                    if(total<1.5)
                        System.out.println("Sorry, not enough money");
                    else
                    {
                        System.out.println("Purchased Crisps");
                        total -= 1.5 ;
                    }
                };break;
                case "Soda" : {
                    if(total<0.8)
                        System.out.println("Sorry, not enough money");
                    else
                    {
                        System.out.println("Purchased Soda");
                        total -= 0.8;
                    }
                };break;
                case "Coke" : {
                    if(total<1.0)
                        System.out.println("Sorry, not enough money");
                    else
                    {
                        System.out.println("Purchased Coke");
                        total -= 1.0;
                    }
                };break;
                default : System.out.println("Invalid product");
            }
            krai=scanner.nextLine();
        }

        System.out.printf("Change: %.2f",total);
    }

}
