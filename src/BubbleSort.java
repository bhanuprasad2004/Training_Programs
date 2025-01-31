import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {40,20,22,10,69,66};
        sort(arr);
    }
    public static void sort(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1 ; j <= arr.length -1 ; j++) {
                if (arr[i] >= arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr)); 
    }
}
