public class linearintsearch {
    public static void main(String[] args) {
        int[] num={12,23,34,45,6,7,865,3,34,4};
        int target=34;
        int ans=Linearsearch(num, target);
        System.out.println(ans);
    }
    static int Linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i=0;i<=arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
