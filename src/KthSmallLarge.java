import java.util.*;

public class KthSmallLarge {

    public static void main(String[] args){
        Integer arr[] = new Integer[] {5, 12, 17, 7, 30, 3, 100};
        int k = 2;

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(arr[k-1] + " ");

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[k-1] + " ");
    }
}