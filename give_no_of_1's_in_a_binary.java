import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static int get_bit(int x,int pos){
        int bitmask=1<<pos;
        if((bitmask&x)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("give a number to check how many zeros are there works for number smaller than 512");
        int x=sc.nextInt();
        int result=0;
        for(int i=0;(i<(Integer.toBinaryString(x)).length());i++){
            if(get_bit(x,i)==1){
                result+=1;
            }
        }
        System.out.println(result);
        if(result==1){
            System.out.println("it's a power of 2");
        }
    }
}
