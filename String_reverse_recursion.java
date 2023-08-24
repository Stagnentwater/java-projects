public class Main {
    public static void main(String[] args){
        String x="abcd";
        reverse(x,0);
    }
    public static void reverse(String x,int b){
        if(x.length()==b){
            return;
        }
        System.out.print(x.charAt((x.length()-1)-b));
        b++;
        reverse(x,b);
    }
}
