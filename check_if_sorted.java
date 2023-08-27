import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static boolean issorted(int[] arr,int index){
        if(index== arr.length-1){
            return true;
        }
        if(!(issorted(arr,index+1))){
            return false;
        }
        return arr[index]<arr[index+1];

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("give the length of the array");
        int len=sc.nextInt();
        int[] arr=new int[len];
        //input
        for(int i=0;i<len;i++){
            System.out.println("give the value of the position"+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println(issorted(arr,0));


    }
}

