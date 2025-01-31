public class FloorofNumber {

    public static void main(String[] args) {
        int[] arr = {7,9,13,17,18,21,24};
        int v = 19;
        floor(arr, v);
    }
    public static void floor(int[] arr, int v) {
        int low = 0;
        int high = arr.length -1;
        int floormax = 0;
        while (low<= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] <= v) {
                floormax = arr[mid];
                low = mid +1;
            } else  {
                high = mid - 1 ;
            }
            
        }
        System.out.println(floormax);
    }
}
