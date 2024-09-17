public class que3211 {
    public static void main(String[] args) {
        int row=1;
        int star=1;
        int n=5;
        int s=1;
        while(row<=n*2-1){
            int i=1;
            while(i<=star){
                if (i%2==0) {
                    System.out.print("*");

                }
                else{
                    System.out.print(s);
                }
                i++;
            }
            if(row>=n){
                star-=2;
                s--;
            }
            else{
                star+=2;
                s++;
            }
            row++;
            System.out.println();
        }
    }
}
