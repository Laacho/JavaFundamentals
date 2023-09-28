package fundamentalsDay9;
import java.util.Scanner;
public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int power=Integer.parseInt(scanner.nextLine());//n
        int start=power;
        int distance=Integer.parseInt(scanner.nextLine());//m
        int factor=Integer.parseInt(scanner.nextLine());//y
        int count=0;

        while(power>=distance)
        {
            power-=distance;
            count++;
            if(power==start*0.5)
            {
                if(factor!=0)
                  power/=factor;
            }

        }
        System.out.println(power);
        System.out.println(count);

    }
}
