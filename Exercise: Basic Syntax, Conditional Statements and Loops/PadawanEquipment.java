package fundamentalsDay6;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double money=Double.parseDouble(scanner.nextLine());
        int students=Integer.parseInt(scanner.nextLine());
        double lightsaberPrice=Double.parseDouble(scanner.nextLine());
        double robesPrice=Double.parseDouble(scanner.nextLine());
        double beltsPrice=Double.parseDouble(scanner.nextLine());
        double total= lightsaberPrice * (Math.ceil((students + 0.1*students))) + (robesPrice * students) + beltsPrice * (students - students/6);
       if(total<=money)
           System.out.printf("The money is enough - it would cost %.2flv.",total);
       else System.out.printf("George Lucas will need %.2flv more.",total-money);


    }
}
