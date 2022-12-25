package Questions;

import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.Scanner;

class JavaRegex{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        a = a.replace("."," ");
        String[] b = a.split(".");


        for(int i = 0; i < b.length; i++){

            if (Integer.parseInt(b[i]) % 1 == 1){

            }else {
                return;
            }
            System.out.println(b[i]);
        }


    }
}

//Write your code here