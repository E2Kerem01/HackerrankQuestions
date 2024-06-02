package questions.mixQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class SortName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int first_word = A.length();
        int second_word = B.length();

        String[] isimler = {A,B};
        Arrays.sort(isimler);
        System.out.println(isimler[0]);
        if (isimler[0] == A ){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
