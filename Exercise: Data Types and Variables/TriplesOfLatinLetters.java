package fundamentalsDay9;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int numbr=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbr; i++) {
            for (int j = 0; j < numbr; j++) {
                for (int k = 0; k <numbr ; k++) {
                    char firstChar=(char)('a'+i);
                    char secondChar=(char)('a'+j);
                    char thirdChar=(char)('a'+k);
                    System.out.printf("%c%c%c%n",firstChar,secondChar,thirdChar);

                }
            }
        }
    }
}
