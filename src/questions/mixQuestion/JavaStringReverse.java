package questions.mixQuestion;

import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer reverseFunc = new StringBuffer(A);
        StringBuffer reverse_A = reverseFunc.reverse();
        int length = A.length();
        int counter = 0;

        List<String> list=new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        for (int i = 0; i<length; i++){

            String harf=A.substring(i, i+1);
            String harf_reverse = reverse_A.substring(i,i+1);
            list2.add(harf_reverse);
            list.add(harf);

            if (harf.equals(harf_reverse)){
                counter++;
            }

        }
        if(counter==A.length()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}


