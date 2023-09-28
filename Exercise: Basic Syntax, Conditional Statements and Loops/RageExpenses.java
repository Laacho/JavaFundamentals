package fundamentalsDay6;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int lostGames=Integer.parseInt(scanner.nextLine());
        double headsetPrice=Double.parseDouble(scanner.nextLine());
        double mousePrice=Double.parseDouble(scanner.nextLine());
        double keyboardPrice=Double.parseDouble(scanner.nextLine());
        double displayPrice=Double.parseDouble(scanner.nextLine());

        //variant 1
//        int headset=lostGames/2;
//        int mouse=lostGames/3;
//        int keyboard=lostGames/6;
//        int display=keyboard/2;
      //  double total=headset*headsetPrice+mouse*mousePrice+keyboard*keyboardPrice+display*displayPrice;
      // System.out.printf("Rage expenses: %.2f lv.",total);


        //variant 2
        System.out.printf("Rage expenses: %.2f lv.",(lostGames/2)*headsetPrice+lostGames/3*mousePrice+lostGames/6*keyboardPrice+lostGames/6/2*displayPrice);
    }

}
