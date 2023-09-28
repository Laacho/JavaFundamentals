package fundamentalsDay6;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double balance=Double.parseDouble(scanner.nextLine());
        String game=scanner.nextLine();
        double total=balance;
        while (!game.equals("Game Time"))
        {
            if(total>balance) {
                System.out.println("Out of money!");
                return;
            }
            switch (game)
            {
                case "OutFall 4":
                    if(total<39.99)
                {
                    System.out.println("Too Expensive");
                }
                    else    {
                        total-=39.99;
                        System.out.printf("Bought %s%n",game);
                    };break;

                case "CS: OG":if(total<15.99)
                {
                    System.out.println("Too Expensive");
                }
                else {
                    total-=15.99;
                    System.out.printf("Bought %s%n",game);
                };break;
                case "Zplinter Zell":
                    if(total<19.99)
                {
                    System.out.println("Too Expensive");
                }
                else {
                    total-=19.99;
                    System.out.printf("Bought %s%n",game);
                };break;
                case "Honored 2":
                    if(total<59.99)
                {
                    System.out.println("Too Expensive");
                }
                else {
                    total-=59.99;
                    System.out.printf("Bought %s%n",game);
                };break;
                case "RoverWatch":
                    if(total<29.99)
                {
                    System.out.println("Too Expensive");
                }
                else {
                    total-=29.99;
                    System.out.printf("Bought %s%n",game);
                };break;
                case "RoverWatch Origins Edition":
                    if(total<39.99)
                    {
                        System.out.println("Too Expensive");
                    }
                    else {
                        total-=39.99;
                        System.out.printf("Bought %s%n",game);
                    };break;
                default:
                    System.out.println("Not Found");
            }

            game= scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",balance-total,total);



    }
}
