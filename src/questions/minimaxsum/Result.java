package questions.minimaxsum;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {


        for (int i = 0; i < arr.size()-1; i++) { //Dizimizin değerlerini sırası ile alıyoruz

            int sayi = arr.get(i); //sıradaki değeri sayi değişkenine atıyoruz
            int temp = i; //sayi 'nin indeksini temp değerine atıyoruz

            for (int j = i+1; j < arr.size() ; j++) { //dizimizde i' den sonraki elemanlara bakıyoruz
                if(arr.get(j) <sayi){ //sayi değişkeninden küçük sayı var mı
                    sayi = arr.get(j); //varsa sayi değişkenimizide değiştiriyoruz
                    temp = j; //indeks değerinide değiştiriyoruz
                }
            }

            if(temp != i){ //temp değeri başlangıç değeri ile aynı değil ise , yani list[i]'nin değerinden küçük sayı varsa onları yer değiştiriyoruz
                arr.set(temp, arr.get(i));
                arr.set(i, sayi);
            }

        }

        for (int sayi:arr) {
            //Bu kısım sıralama ile ilgili değil sadece sıralamanın doğru calısıp calısmadıgını kontrol etmek için
            System.out.println(sayi);

        }

    }

}

