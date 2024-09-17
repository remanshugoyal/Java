import java.util.Scanner;

public class que27 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int  spaces=n;


        int row=1;

        while(row<=n){
            int num=2*row-1;
            int i=1;
            while(i<spaces){
                System.out.print(" ");
                i++;            }
            int j=1;
            int r=1;
            while(j<=num){
                System.out.print(r);
                j++;
                if(j<=row){
                    r++;
                }
                else{
                    r--;
                }

            }

            spaces--;
            row++;
            System.out.println();


        }

    }
}
