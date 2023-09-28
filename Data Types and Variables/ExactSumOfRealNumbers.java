package fundamentalsDay8;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int count=Integer.parseInt(scanner.nextLine());
        BigDecimal sum=new BigDecimal("0");
        for (int i = 0; i < count; i++) {
            BigDecimal chislo=new BigDecimal(scanner.nextLine());
            sum=chislo.add(sum);
        }
        System.out.println(sum);
    }
}
