import java.util.*;
public class que31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        while(row<=n){
            int k=1;
            int i=n;
            while(k<=n){
                System.out.print(i);
                i--;
                k++;
            }
            System.out.println();
            row++;
        }
    }
}
