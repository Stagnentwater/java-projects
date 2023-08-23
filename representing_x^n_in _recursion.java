public class Main {
    public static void main(String[] args){
        System.out.println(paw(2,5));
    }
    public static int paw(int x, int n) {
        if(n==0){
            return 1;
        }
        int fu=x * paw(x,n-1);
        return fu;



    }
}
