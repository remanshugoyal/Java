import java.util.*;

public class que17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=7;
        int row=1;
        int star=n/2+1;
        int space=0;
        while(row<=n) {
            int j=1;
            while(j<=star) {
                System.out.print("* ");
                j++;
            }
            int k=1;
            while(k<=space) {
                System.out.print("  ");
                k++;
            }int p=1;
            while(p<=star) {
                System.out.print("# ");
                p++;
            }if(row<=n/2) {
                star--;
                space=space+2;
            }else {
                star++;
                space=space-2;
            }
            row++;
            System.out.println();
        }
    }}
