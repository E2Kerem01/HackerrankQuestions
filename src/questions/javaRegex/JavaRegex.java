package questions.javaRegex;
import java.util.Scanner;


class JavaRegex{


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String result = null;
        while (scan.hasNext()){
            String input = scan.nextLine();
            MyRegex(input, result);
        }
    }

    static void MyRegex(String a, String result) {

        String b = a.replace("."," ");
        String[] c = b.split(" ");
        result = "true";

        if (a.startsWith(".") || a.endsWith(".")){
            result = "false";
        }

        for(int i = 0; i < c.length; i++){


            for ( String num : c) {

                try {
                    Integer.parseInt(num);
                }catch (NumberFormatException ex){
                    result = "false";
                    break;
                }
                if (a.startsWith(".") || a.endsWith(".")){
                    result = "false";
                    break;
                }
                if ((Integer.parseInt(num)<0) || (Integer.parseInt(num)>255)){
                    result = "false";
                    break;
                }
                if (c.length!=4){
                    result = "false";
                    break;
                }
                if (num.length() > 3){
                    result = "false";
                    break;
                }
                if (num.equals(" ") || b.equals(" ")){
                    result = "false";
                    break;

                }
            }
        }
        System.out.println(result);
    }
}

