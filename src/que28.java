import java.util.Scanner;

public class que28
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int  spaces=n;
        int r=1;

        int row=1;

        while(row<=n){
            int num=2*row-1;
            int i=1;
            while(i<spaces){
                System.out.print(" ");
                i++;            }
            int j=1;


            while(j<=num){
                System.out.print(r);

                if(j<=row){
                    r++;
                }
                else{
                    r--;
                }
                j++;

            }

            spaces--;
            row++;
            System.out.println();
            r++;

        }
        r++;
    }
}
