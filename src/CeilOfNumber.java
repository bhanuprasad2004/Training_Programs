public class CeilOfNumber {
    public static void main(String[] args) {
        int[] arr = {3,6,7,9,10,27,35,63,70};
        int v = 25;
        ceilvalue(arr, v);
    }
    public static void ceilvalue(int[] arr, int v) {
        int low = 0;
        int high = arr.length - 1;
        int ceil = 0;
        while (low<=high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= v) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(ceil);
        //return ceil;
    }
}
