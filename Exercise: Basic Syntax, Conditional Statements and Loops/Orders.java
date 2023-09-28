package fundamentalsDay6;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

            //((daysInMonth * capsulesCount) * pricePerCapsule)
        int n=Integer.parseInt(scanner.nextLine());
        double total=0;
        while (n>0)
        {
            double pricePerCapsule=Double.parseDouble(scanner.nextLine());
            int days=Integer.parseInt(scanner.nextLine());
            int capsulesCount=Integer.parseInt(scanner.nextLine());
            total+=days * capsulesCount * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n",(days * capsulesCount) * pricePerCapsule);
            n--;
        }
        System.out.printf("Total: $%.2f",total);
    }
}
