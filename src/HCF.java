import java.util.*;
public class HCF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int min=0;
        if (a>b){
            min =b;

        else{
            min=a;
        }

        for(int i=min;i>=1;i--){
            if ((a%i==0) && (b%i==0)){
                System.out.println(i);
                break;
            }
        }
    }
}