package questions.anagrams;

import java.util.*;


public class Anagrams {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        String a_new = a.toLowerCase(Locale.ROOT);
        String b_new = b.toLowerCase(Locale.ROOT);

        int counter = 0;
        int a_uzunlugu = a.length();
        int b_uzunlugu = b.length();

        List<String> list=new ArrayList<String>();
        List<String> list2=new ArrayList<String>();



        for (int i=0; i < a_uzunlugu;i++){

            String s = String.valueOf(a_new.charAt(i));

            list.add(s);

        }

        for (int t=0; t < b_uzunlugu; t++){

            String s1 = String.valueOf(b_new.charAt(t));

            list2.add(s1);
        }

        for (int k=0; k < a_uzunlugu ; k++){
            for (int j=0; j < b_uzunlugu; j++){

                String aString = list.get(k);
                String bString = list2.get(j);


                if(Objects.equals(aString, bString)){

                    list2.remove(j);
                    b_uzunlugu-=1;
                    counter += 1;

                    break;


                }
            }
        }



        if ((list2.size()==0) && (counter==a_uzunlugu)){
            System.out.print("Questions.Anagrams");
        }
        else{
            System.out.print("Not Questions.Anagrams");


        }
    }
}
