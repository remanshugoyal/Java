public class hollowstar {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if (((i+j)>=6)&&(i+j<=10)&&((i-j)<=2)&&((j-i)<=2)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if (((i+j)>=7)&&(i+j<=13)&&((i-j)<=3)&&((j-i)<=3)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
