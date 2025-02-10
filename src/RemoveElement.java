import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 5};
        int val = 1;
        remove(arr, val);
        // System.out.println(Arrays.toString(arr));
    }
    public static void remove(int[] arr, int val) {
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                newarr[i] = arr[i];
            }
            //System.out.println(Arrays.toString(arr));
        }
        // System.out.println(newarr);
        System.out.println(Arrays.toString(arr));
    }
}
