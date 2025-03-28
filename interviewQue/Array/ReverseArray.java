import java.util.*;

public class ReverseArray {
   [] public ReverseArray(int[] arr) { 
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        new ReverseArray(arr);  
        System.out.println(Arrays.toString(arr));
    }
}
