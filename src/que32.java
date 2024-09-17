
import java.util.Scanner;

public class que32

{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


int n= sc.nextInt();

int star=n;

int row=1;

while(row<=n){

int i=1;

while(i<=n){

        if(i==star){

System.out.print("*\t"); }else

        System.out.print(i+"\t");

i++;

        }

        System.out.println();

row++;

star--;}}}