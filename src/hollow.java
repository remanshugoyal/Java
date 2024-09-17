import java.util.*;
public class hollow {
    public static void main(String[] args) {


                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int star=n/2;
                int space=1;
                int row=1;
           while(row<=n) {
               if (row == 1) {
                   int q = 1;
                   while (q <= n) {
                       System.out.print("*");
                       q++;
                   }
               } else {
                   int i = 1;
                   while (i <= star) {
                       System.out.print("*");
                       i++;
                   }
                   int j = 1;
                   while (j <= space) {
                       System.out.print(" ");
                       j++;
                   }
                   int k = 1;
                   if (row == n) {
                       k = 2;
                   }
                   while (k <= star) {
                       System.out.print("*");
                       k++;
                   }
                   if (row <= n / 2) {
                       star--;
                       space += 2;
                   } else {
                       star++;
                       space -= 2;
                   }
               }
               row++;
               System.out.println();
           }
            }
        }

