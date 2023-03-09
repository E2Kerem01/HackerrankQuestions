package questions;

import java.util.Scanner;



public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();


        s = s.trim();


        if (s.length()==0){
            System.out.println(0);
        }else {
            String sList[] = s.split("['!?,._@ ]+");
            System.out.println(sList.length);
            for (int i = 0; i < sList.length ; i++){

                System.out.println(sList[i]);

            }
        }

    }
}
