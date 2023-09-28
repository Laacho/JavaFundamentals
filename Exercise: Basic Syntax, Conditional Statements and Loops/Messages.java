package fundamentalsDay6;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int length=Integer.parseInt(scanner.nextLine());
        String otgovor="";
        while (length!=0)
        {
            String chislo= scanner.nextLine();//44
            if(chislo.equals("0"))
            otgovor+=" ";
            else {
                int mainDigit = Character.getNumericValue(chislo.charAt(0));
                int offset = (mainDigit - 2) * 3;
                if (mainDigit == 8 || mainDigit == 9)
                    offset += 1;
               otgovor+=Character.toString((char)((offset + chislo.length()-1)+97));
            }
            length--;
        }
        System.out.println(otgovor);


    }
}
