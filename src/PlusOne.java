import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9};
        addone(arr);

    }
    public static void addone(int[] arr) {
        
            arr[arr.length - 1] = arr[arr.length - 1] + 1;
            System.out.println(Arrays.toString(arr));
        }
       
    }
