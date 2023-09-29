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

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    int h1=(int)s.charAt(1)-'0';
    int h2=(int)s.charAt(0)-'0';
    int hh=(h2*10+h1%10);
    if(s.charAt(8)=='A'){
        if(hh==12){
            return "00"+s.substring(2,8);
              
        }
        else{
            return s.substring(0,8);
        }      
    }
    else{
        if(hh==12){
            return "12"+s.substring(2,8);
        }
        else{
            hh=hh+12;
            return hh+s.substring(2,8);
        }
    }

    }

}


