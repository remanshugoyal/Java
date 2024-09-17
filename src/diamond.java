import java.util.*;
public class diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int space=n/2;
        int sp=1;
        int row=1;
        while(row<=n){
                if (row==1){
                    int p=1;
                    while(p<=space){
                        System.out.print(" ");
                        p++;
                    }
                    System.out.print("*");
                    int q=1;
                    while(q<=space){
                        System.out.print(" ");
                        q++;
                    }
                }
                else if(row==n){
                    int r=1;
                     space= n/2;
                    while(r<=space){
                        System.out.print(" ");
                        r++;
                    }
                    System.out.println("*");
                    int s=1;
                    while(s<=space){
                        System.out.print(" ");
                        s++;
                    }
            }
                else{
                    int i=1;
                    while(i<space){
                        System.out.print(" ");
                        i++;
                    }
                    System.out.print("*");
                    int j=1;
                    while(j<=sp){
                        System.out.print(" ");
j++;                    }
                    System.out.print("*");
                    int k=1;
                    while(k<space){
                        System.out.print(" ");
                        k++;
                    }
                    if(row<=n/2){
                        sp+=2;
                        space--;
                    }
                    else{
                        sp-=2;
                        space++;
                    }


                }
                row++;
            System.out.println();

        }
    }
}
