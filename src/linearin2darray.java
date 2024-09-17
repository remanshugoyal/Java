import java.util.Arrays;
public class linearin2darray {
    public static void main(String[] args) {

        int[][] num2={{12,23,34,45},{6,7,865,3},{34,4}};
        int target=865;
        int[] ans=Linearsearch(num2, target);
        System.out.println(Arrays.toString(ans));
    }   
    static int[] Linearsearch(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                int element = arr[i][j];
                if (element == target) {

                    return new int[]{i, j};
                }}
            }
            return new int[]{-1, -1};
        }
    }


