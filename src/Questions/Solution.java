package Questions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.format.*;



class Result {

    /*
     * Complete the 'preprocessDate' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY dates as parameter.
     */

    public static List<String> preprocessDate(List<String> dates) {

        List<String> outputDate = new ArrayList<>();
        for(String myDate :  dates){
            myDate = myDate.replace("st", "").replace("nd","").replace("th","");

            Date tempDate = null;
            try {
                tempDate = new SimpleDateFormat("dd MM yyyy", new Locale("ENGLISH")).parse(myDate);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            DateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            cal.setTime(tempDate);
            int year = cal.get(Calendar.YEAR);

            if(year>1900 && year <= 2100){
                String strDate = dft.format(tempDate).toString();
                outputDate.add(strDate);
            }else {
                System.out.println("False Year");
            }
        }

        return outputDate;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int datesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> dates = IntStream.range(0, datesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = Result.preprocessDate(dates);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

