public class pattern123 {
    public static void main(String[] args) {
        int n=4;
        int row=1;
        int spaces=2*n-3;
        int num=1;
        while(row<=n){
            int i=1;
            int w=1;
            while(i<=num){
                System.out.print(w++);
                i++;
            }
            int j=1;
            while(j<=spaces){
                System.out.print(" ");
                j++;
            }
            int k=1;
            int m=num;
            if(row==n){
                m--;
                k=2;
            }
            w=1;

            while(k<=num){

                System.out.print(m--);
                k++;
            }
            System.out.println();
            row++;
            spaces-=2;
            num++;


        }
    }
}
