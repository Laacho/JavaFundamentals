package fundamentalsDay6;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String username=scanner.nextLine();
        String password="";
        for (int i = username.length()-1; i >=0 ; i--)
            password += username.charAt(i);
        String enteredPassword= scanner.nextLine();
        int count=0;
        while (!enteredPassword.equals(password)){
            count++;
            if(count==4)
            {System.out.printf("User %s blocked!",username);
            return;}
            System.out.println("Incorrect password. Try again.");
            enteredPassword= scanner.nextLine();

        }
        System.out.printf("User %s logged in.",username);

//        for (int i = 0; i < 3; i++) {
//            String temp=scanner.nextLine();
//            if(temp.equals(password))
//            {System.out.printf("User %s logged in.",username);return;}
//            else System.out.println("Incorrect password. Try again.");
//        }
//        String temp=scanner.nextLine();
//        if(temp.equals(password))
//        System.out.printf("User %s logged in.",username);
//        else System.out.printf("User %s blocked!",username);

    }
}
