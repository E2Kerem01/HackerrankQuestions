
import java.util.Scanner;

public class getSmallestAndLargest {

    public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";
            largest = s.substring(0, k);
            smallest = s.substring((s.length()-k),s.length());
            for (int j=1; j<s.length()-k+1; j++) {
                String substr = s.substring(j, j+k);
                if (smallest.compareTo(substr) > 0)
                    smallest = substr;
                if (largest.compareTo(substr) < 0)
                    largest = substr;
            }

            return smallest + "\n" + largest;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}


