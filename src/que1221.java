public class que1221 {
    public static void main(String[] args) {
        int n=5;
        int row=1;


        int spaces=n-1;
        while(row<=n){
            int i=1;
            while(i<=spaces){
                System.out.print(" ");
                i++;
            }
            int j=1;
            int star=2*row-1;
            while(j<=star){
                if(j%2==0){
                    System.out.print("!");

                }
                else{
                    System.out.print("*");
                }
                j++;
            }
            row++;
            spaces--;
            System.out.println();
        }
    }
}
