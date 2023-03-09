package questions;


import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < num; i++){
            String str = scan.nextLine();
            try {
                Pattern.compile(str);
                System.out.println("Valid");
            }catch (Exception e){
                System.out.println("Invalid");
            }

        }
    }


}



