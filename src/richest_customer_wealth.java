public class richest_customer_wealth {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1,7}};
        int max = Integer.MIN_VALUE;


            for(int i = 0; i < arr.length; i++) {
                int sum = 0;
                for (int j = 0; j <arr[i].length; j++) {
                    sum = sum + arr[i][j];
                }
                if (sum > max) {
                    max = sum;
                }



            }
        System.out.println(max);

    }}
