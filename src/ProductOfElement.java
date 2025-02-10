import java.util.Arrays;

public class ProductOfElement {
    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        product(arr);
        System.out.println();
    }
    public static void product(int[] arr) {
        int left;
        int right;
        for (int i = 0; i < arr.length; i++) {
            left = 1;
            right = 1;
            for (int j = 0; j < i ; j++) {
                left = left * arr[j];
            }
            for (int k = i + 1; k < arr.length; k++) {
                right = right * arr[k];
            }
                
            int total = left * right;
            System.out.print(total + " ");
        }
        System.out.println();
    }

}
