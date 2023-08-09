import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        //used a string builder as its fast and consumes less memory
        StringBuilder A_reversed = new StringBuilder();
        for(int i=A.length()-1;i>=0;i--){
            A_reversed.append(A.charAt(i));
        }
        //used equals() also called reference comparision here as "==" only does pointer comparision not the content compare
        if (A_reversed.toString().equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
            System.out.println(A_reversed);
        }

    }
}
