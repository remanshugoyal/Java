import java.util.*;
public class w2darray {
    public static void main(String[] args) {

//// input
//        Scanner sc=new Scanner(System.in);
//
//        int[][] arr=new int[3][3];
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                arr[i][j] =sc.nextInt();
//            }
//        }
//// output
////        ist method
//
////        for(int i=0;i<arr.length;i++){
////            for(int j=0;j<arr[i].length;j++){
////                System.out.print(arr[i][j]+ " ");
////            }
////            System.out.println();
////        }
//// 2nd method
////        for(int i=0;i<arr.length;i++){
////            System.out.println(Arrays.toString(arr[i]));
////        }
////  3rd method
//            for(int[] a : arr){
//                System.out.println(Arrays.toString(a));
//            }

        int arr[][]={{1,2,3},{2,3},{6,7,8,6,5}};
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
