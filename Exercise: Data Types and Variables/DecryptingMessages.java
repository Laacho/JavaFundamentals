package fundamentalsDay9;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int key=Integer.parseInt(scanner.nextLine());
        int n=Integer.parseInt(scanner.nextLine());
        String message="";
        for (int i = 0; i < n; i++) {
            char temp=scanner.nextLine().charAt(0);
            temp+=key;
            message+=(char)temp;
        }
        System.out.println(message);
    }
}
