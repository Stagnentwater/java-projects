import java.util.Objects;
import java.util.Scanner;
public class Main {


    public static void main(String [] args){
        //spiral printing of an array
        //input of the array
        Scanner sc=new Scanner(System.in);
        System.out.println("give the number of rows");
        int n=sc.nextInt();
        System.out.println("give the no of columns");
        int m=sc.nextInt();
        int [][] nums=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("give an input for the position : ("+(i+1)+","+(j+1)+")");
                nums[i][j]=sc.nextInt();
            }
        }
        int rowst=0;
        int rowend=n-1;
        int colst=0;
        int colend=m-1;
        while(rowend>=rowst && colend>=colst){
            //traveling in the row start
            for(int i=colst;i<=colend;i++){
                System.out.print(nums[rowst][i]+" ");
            }
            rowst++;
            //traveling in the column end
            for(int i=rowst;i<=rowend;i++){
                System.out.print(nums[i][colend]+" ");
            }
            colend--;
            //travelling in the rowend
            for(int i=colend;i>=colst;i--){
                System.out.print(nums[rowend][i]+" ");
            }
            rowend--;
            //traveling in the col start
            for(int i=rowend;i>=rowst;i--){
                System.out.print(nums[i][colst]+" ");
            }
            colst++;
        }
    }
}
