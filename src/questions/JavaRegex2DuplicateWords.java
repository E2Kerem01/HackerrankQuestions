package questions;


import java.util.*;

public class JavaRegex2DuplicateWords {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int stringNumber = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < stringNumber; i++){
            String sentence = scan.nextLine();
            myRegex(sentence);

        }
    }

    static void myRegex(String a){
        List<String> b = new ArrayList<>(Arrays.asList(a.split(" ")));
        int limit = b.size() - 1;
        for (int k = 0; k <= limit; k++){
            for (int j = k + 1; j <= limit; j++){
                if (b.get(k).toLowerCase().equals(b.get(j).toLowerCase())){
                    b.remove(j);
                    limit--;
                    j--;
                }
            }

        }String joinedString = String.join(" ", b);
        System.out.println(joinedString);

    }
}
