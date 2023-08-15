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
        //write a program to tell if a number is a power of 2
        //brute force method
        Scanner sc=new Scanner(System.in);
        System.out.println("give a number");
        double n=sc.nextInt();
      //logic is that we keep dividing it by 2 until it becomes 2
      //if it becomes 2 then it's a power of 2
        if(n!=2){
            do{

                 n=n/2;
            }while(n>2);
            if(n==2){
                System.out.println("yes it's a power of 2");
            }else{
                System.out.println("it's not a power of 2");
            }

        }else if(n==2){
            System.out.println("yes it's a power of 2");
        }
        //another non brute force method and a one which uses bit manipulation is 
        // it also tells us how many 1s are there in a number
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
