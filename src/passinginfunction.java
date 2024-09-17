import java.util.Arrays;

public class passinginfunction {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        chandasge(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void chandasge(int[] rowa){
        rowa[2]=90;

    }
}
