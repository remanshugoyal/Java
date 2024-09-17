import java.util.*;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(3);
//        list.add(23);
//        list.add(4533);
//        list.add(2333);
//        list.remove(2);
//        list.set(0,32);
//        System.out.println(list.contains(324923));
//        System.out.println(list);

        for(int i=0;i<3;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<3;i++){
            System.out.println(list.get(i));
        }
    }
}
