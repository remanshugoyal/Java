import java.util.*;
public class HCFBYEuclidean {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        //        check max num
        int max=0;
        int min=0;
        if (a>b){
             max=a;
             min=b;
        }
        else{
             max=b;
             min=a;
        }
//        HCF CODE
        while(min!=0){
            int temp=min;
            int r=max%min;
            max=temp;
            min=r;
        }
        System.out.println(max);
    }
}
