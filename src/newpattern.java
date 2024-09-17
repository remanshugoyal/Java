import java.util.*;
public class newpattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1,k;
        int spaces=2*n-3;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=spaces){
                System.out.print("  ");
                j++;
            }
            i=1;
            if (row==n){
                k=star-1;

            }
            else{
                k=star;
            }
            while(i<=k){
                System.out.print("* ");
                i++;
            }
            spaces-=2;
            star++;
            row++;
            System.out.println( );
        }


    }
}
