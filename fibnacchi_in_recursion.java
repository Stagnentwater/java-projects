import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("no. of elements that are to be printed");
        int n= sc.nextInt();
        System.out.print(0+" "+1+" ");
        fib(0,1,n-2);
    }
    public static void fib(int a,int b,int n) {
        int c=a+b;
        System.out.print(c+" ");
        n--;
        if(n<=0){
            return;
        }
        fib(b,c,n);
    }
}
