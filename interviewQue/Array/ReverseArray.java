
import java.util.*;

class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        new ReverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    public ReverseArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int temp = arr[l]; // Fixed: Correct array access
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

    }
}
