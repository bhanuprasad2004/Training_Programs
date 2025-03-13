import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
     int[] arr = {5, 3, 1, 2, 8, 1, 8};
     int val = 1; 
     remove(arr, val);  
    }
    public static void remove(int[] arr, int val)  {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val){
                count++;
            }
        }
        
        int[] newarr = new int[arr.length - count];
        int index = 0;
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] != val) {
                newarr[index++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
