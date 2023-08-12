import java.util.Scanner;
public class Main {
    public static void get_bit(int n,int pos){
        int bit_mask=1<<pos;
        if((bit_mask & n)==0){
            System.out.println("the value at position "+pos+" is 0");
        }else{
            System.out.println("the value at position "+pos+" is 1");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("give the integer that we have to check for");
        int x =sc.nextInt();
        System.out.println("give the position that we have to check for");
        int z=sc.nextInt();
        get_bit(x,z);


    }
}
