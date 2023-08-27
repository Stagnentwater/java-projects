import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int first=-1;
    public static int last=-1;
    public static void main(String[] args){
        String x="a";
        str(x,0,'a');

    }
    public static void str(String x,int index,char element){
        if(index==x.length()){
            System.out.print("the first occurance "+first+"\n"+"the last occurance "+last);
            return;
        }
        if(x.charAt(index)==element){
            if(first==-1){
                first=index;
                index++;
                str(x,index,element);
            }else if(x.length()==1){
                first=0;
                last=0;
                index++;
                str(x,index,element);
            }
            else{
                last=index;
                index++;
                str(x,index,element);
            }
        }else{
            index++;
            str(x,index,element);
        }
    }
}
