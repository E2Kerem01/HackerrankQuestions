package questions.plusmines;


import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultPlusMines {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        float dividing = arr.size();
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumber = new ArrayList<>();
        List<Integer> zeros = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i)>0){
                positiveNumbers.add(arr.get(i));
            } else if (arr.get(i)==0) {
                zeros.add(arr.get(i));
            } else {
                negativeNumber.add(arr.get(i));
            }
        }

        float resultPositive = positiveNumbers.size()/dividing;
        float resultNegative = negativeNumber.size()/dividing;
        float resultZeros = zeros.size()/dividing;
        System.out.println(resultPositive);
        System.out.println(resultNegative);
        System.out.println(resultZeros);
    }
}


