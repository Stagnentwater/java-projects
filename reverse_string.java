import java.util.Scanner;
public class main{
  public static void main(string[] args){
    Scanner sc= new Scanner(System.in);
    String word=sc.nextLine();
    StringBuilder reversed_word= new StringBuilder;
    for(int i=word.length()-1;i>=0;i--){
      reversed_word.append(word.charAt(i));
    }
    System.out.println(reversed_word);
    }
  //another half string method
  StringBuilder A= new StringBuilder("hello");
        //halfstringmethodtoreversestring
        for(int i=0;i<=A.length()/2;i++){
            int front=i;
            int end=A.length()-1-i;

            char frontchar=A.charAt(front);
            char endchar=A.charAt(end);

            A.setCharAt(front,endchar);
            A.setCharAt(end,frontchar);
        }
        System.out.println(A);
  }
}
