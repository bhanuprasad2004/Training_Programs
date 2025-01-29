public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4,2,8,9,5,1};
        int k = 9;
        search( arr, k);

    }   
    public static void search(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.println(arr[i] + "  Element found at index : " + i);
            }
        }
        System.out.println("Not found");
    }
}
