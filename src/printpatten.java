import java.util.*;
public class printpatten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int row=1;
 while(row<=2*n-1){ //row<=n
            int j=1;
            while(j<=star){
                System.out.print("*");
                j++;
            }
//            row++;
//            star++;
//            System.out.println();
            if (row <n){
                star++;
            }
            else{
                star--;
            }
            row++;
            System.out.println();
        }
    }
}
