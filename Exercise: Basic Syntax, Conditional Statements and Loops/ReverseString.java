package fundamentalsDay6;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String test= scanner.nextLine();
        String ans="";
        for (int i = test.length()-1; i >=0 ; i--) {
            ans+=test.charAt(i);
        }
        System.out.println(ans);
    }
}
