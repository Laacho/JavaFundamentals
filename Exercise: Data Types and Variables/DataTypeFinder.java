package fundamentalsDay9;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String first= scanner.nextLine();
        while(!first.equals("END"))
        {
            if(first.equalsIgnoreCase("true") || first.equalsIgnoreCase("false"))
                System.out.printf("%s is boolean type%n",first);
            else if(first.length()==1)
            {       if(first.charAt(0)< 47 || first.charAt(0)>58)
                         System.out.printf("%s is character type%n",first);
                    else
                            System.out.printf("%s is integer type%n",first);
            }

            else {
                boolean isString = false;
                boolean isFloating = false;
                for (int i = 0; i < first.length(); i++) {
                    char temp = first.charAt(i);

                    if (temp < 45 || temp > 57) {
                        isString = true;
                    }
                    if (temp == 46) {
                        isFloating = true;
                    }
                }
                if(isString)
                    System.out.printf("%s is string type%n",first);
                else {
                    if(isFloating)
                        System.out.printf("%s is floating point type%n",first);
                    else  System.out.printf("%s is integer type%n",first);

                }

            }
            first=scanner.nextLine();
        }

    }
}
