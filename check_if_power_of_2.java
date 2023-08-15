import java.util.Objects;
import java.util.Scanner;
public class Main {
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
    }
}
