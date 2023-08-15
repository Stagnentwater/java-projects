import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        //toggle a bit at a given pos and number
        Scanner sc= new Scanner(System.in);
        System.out.println("give a number as an input");
        int n=sc.nextInt();
        System.out.println("give the position that needs to be altered");
        int pos=sc.nextInt();
        System.out.println("give the change 0 or 1");
        int inst=sc.nextInt();
        int bitmask=1<<pos;
        if(inst==0){
            int newbitmask=~bitmask;
            System.out.println(newbitmask & n);
        }else{
            System.out.println(bitmask | n);
        }


    }
}
