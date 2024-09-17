import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
public class practive {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,-2,-5,3));

        int j=0;
        int k=0;
        int arrp[]=new int[arr.size()];
        int arrn[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0){
                arrp[j++]=arr.get(i);
            }
            else{
                arrn[k++]=arr.get(i);
            }
        }
        System.out.println(Arrays.toString(arrp));
        System.out.println(ar

