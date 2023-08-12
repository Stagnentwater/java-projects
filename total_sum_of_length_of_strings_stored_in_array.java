import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("give the length of the array");
        int x =sc.nextInt();
        String [] stringarray=new String [x];
        sc.nextLine();//eat up the newline value
        //input
        for(int i=0;i<x;i++){
            System.out.println("give an input string for:  "+(i+1)+"  index");
            stringarray[i]=sc.nextLine();
        }
        //logic
        int totallength=0;
        for(int i=0;i<x;i++){
            totallength+=stringarray[i].length();
        }
        System.out.println(totallength);
        // same thing with stringbuilder calss as follows

        System.out.println("give the length of the array");
        int x =sc.nextInt();
        StringBuilder [] stringarray=new StringBuilder[x] ;
        sc.nextLine();//eat up the newline value

        for(int i=0;i<x;i++){
            System.out.println("give an input string for:  "+(i+1)+"  index");
            stringarray[i]=new StringBuilder("");
            stringarray[i].append(sc.nextLine());
        }
        int totallength=0;
        for(int i=0;i<x;i++){
            totallength+=stringarray[i].length();
        }
        System.out.println(totallength);
    }
}

