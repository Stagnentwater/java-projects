import java.util.Objects;
import java.util.Scanner;
public class Main {
    //update bit
    public static int update_bit(int x,int pos,int inst){
        if(inst==1){
            return set_bit(x,pos);
        }else{
            return clear_bit(x,pos);
        }
    }
    //set bit
    public static int set_bit(int x,int pos){
        int bitmask=1<<pos;
        int result=x|bitmask;
        return result;
    }
    //get bit
    public static int get_bit(int x,int pos){
        int bitmask=1<<pos;
        if((bitmask&x)==0){
            return 0;
        }else{
            return 1;
        }
    }
    //clear bit
    public static int clear_bit(int x,int pos){
        int bitmask=1<<pos;
        int result=(~bitmask)&x;
        return result;

    }
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give the number");
        int x=sc.nextInt();
        System.out.println("give the position to do the operation");
        int pos=sc.nextInt();
        sc.nextLine();
        System.out.println("give the operation that needs to be done");
        String choice= sc.nextLine();
        System.out.println("give what you want that position no to become 0 or 1");
        int inst=sc.nextInt();
        if(Objects.equals(choice, "get bit")){
            System.out.println(get_bit(x,pos));
        }else if(Objects.equals(choice, "set bit")){
            System.out.println(set_bit(x,pos));
        }else if(Objects.equals(choice, "clear bit")){
            System.out.println(clear_bit(x,pos));
        }else if (Objects.equals(choice,"update bit")){
            System.out.println(update_bit(x,pos,inst));
        }else{
            System.out.println("invalid input");
        }
        }
    }
