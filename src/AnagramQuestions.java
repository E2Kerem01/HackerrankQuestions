import java.io.*;
import java.util.*;

public class AnagramQuestions {

    class isAnagram {

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        String[] a_new = a.split(",");
        System.out.println(a_new);
        for (String a_parca : a_new){
            System.out.println(a_parca);
        }
        //System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
