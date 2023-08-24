import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
//the height is log n as after 
public class Main {
    public static void main(String[] args){

        System.out.println(calpow(2,10));
    }
    public static int calpow(int x,int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        if(n%2==0){
            int i=calpow(x,n/2);
            return i*i;
        } else{
            int i=calpow(x,(n-1)/2);
            return (i*i)*x;//we just reduced the power to even so that value is not lost 
        }


    }
}
