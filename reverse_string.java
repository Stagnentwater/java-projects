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
  }
}
