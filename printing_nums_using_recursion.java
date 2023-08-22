public class Main {
    public static void main(String[] args){
        print(5);

    }
    public static void print(int x){
        if(x==0){
            return;
        }else{
            System.out.println(x);
            print(x-1);
        }
    }

}
