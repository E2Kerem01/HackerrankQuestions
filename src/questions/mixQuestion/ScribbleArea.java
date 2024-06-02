package questions.mixQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScribbleArea {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int stringNumber = scan.nextInt();
        String result = null;
        scan.nextLine();

        for(int i = 0; i < stringNumber; i++){
            String sentence = scan.nextLine();
            List<String> b = new ArrayList<>(Arrays.asList(sentence.split(" ")));
            int limit = b.size() - 1;
            for (int k = 0; k <= limit; k++){
                for (int j = k + 1; j <= limit; j++){
                    if (b.get(k).equalsIgnoreCase(b.get(j))){
                        b.remove(j);
                        limit--;
                        j--;
                    }
                }
            }result = String.join(" ", b);
            System.out.print(result);
        }scan.close();
    }
}
