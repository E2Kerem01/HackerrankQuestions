package questions.fizzBuzz;

import java.util.Scanner;

public class FizzBuzz {


    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i < n+1; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("FizzBuzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
