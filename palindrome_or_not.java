import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder A_reversed = new StringBuilder();
        for(int i=A.length()-1;i>=0;i--){
            A_reversed.append(A.charAt(i));
        }
        if (A_reversed.toString().equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
            System.out.println(A_reversed);
        }

    }
}
