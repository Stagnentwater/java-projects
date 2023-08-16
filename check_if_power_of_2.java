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
        //-------------------------------------------------------------------------------------------------------------------
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
        //-------------------------------------------------------------------------------------------------------------------
        //another method or function
        public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;//when 1 is subtracted from a number then the rearest 1 from the back is fliped
        //and the zeros leading to it are converted to 1, anding them results in 0 for a power of 2 number as it has only one 1
    }
    }
}
