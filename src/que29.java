public class que29 {
    public static void main(String[] args) {
        int n=5;
        int spaces=n-1;
        int row=1;


        while(row<=n){
            int i=1;
            while(i<=spaces){
                System.out.print(" ");
                i++;
            }
            int j=1;
            int num=2*row-1;
            while(j<=num){
                if (j==1 || j==num){
                    System.out.print(row);
                }
                else{
                    System.out.print("0");
                }
                j++;
            }spaces--;
            row++;
            System.out.println();

        }
    }
}
