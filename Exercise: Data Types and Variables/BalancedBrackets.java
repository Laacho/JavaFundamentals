package fundamentalsDay9;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());
        int leftBR=0,rightBR=0;
        for (int i = 0; i < n; i++) {
            String duma= scanner.nextLine();
            for (int j = 0; j < duma.length(); j++) {
                if(duma.charAt(j)=='(')
                    leftBR++;
                else if(duma.charAt(j)==')' && leftBR-rightBR==1)
                    rightBR++;
            }

        }
        if(leftBR==rightBR)
            System.out.println("BALANCED");
        else System.out.println("UNBALANCED");
    }
}
