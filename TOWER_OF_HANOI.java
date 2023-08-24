import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        hanoi(3,1,3);


    }
    public static void hanoi(int n,int start,int end) {
        if(n==1){
            pm(start,end);
        }else{
            int aux=6-(start+end);
            hanoi(n-1,start,aux);
            pm(start,end);
            hanoi(n-1,aux,end);
        }

    }
    public static void pm(int start,int end){
        System.out.println(start+"--->"+end);

    }
}
