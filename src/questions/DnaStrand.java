package questions;

import java.util.Scanner;

public class DnaStrand {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String s = scan.nextLine();
        StringBuilder sbf = new StringBuilder(s);
        sbf.reverse();

        for (int i = 0; i < s.length(); i++){

            if (sbf.charAt(i)=='G'){
                sbf.append('C');
            }if (sbf.charAt(i)=='C'){
                sbf.append('G');
            }if (sbf.charAt(i)=='T'){
                sbf.append('A');
            }if (sbf.charAt(i)=='A'){
                sbf.append('T');
            }

        }sbf.delete(0,s.length());
        System.out.println(sbf);
    }
}
