// public class SumOfMaxSumArray {
//     public static void main(String[] args) {
//         int[] arr = {3,4,1,6,7,9,10,7,6,2};
//         int k = 3;
//         subarray(arr, k);
//     }
//     public static void subarray(int[] arr, int k) {
//         int MaxSum = 0;
//         for (int i = 0; i <= arr.length - k; i++) {
//             int sum = 0;
//             for (int j = i; j < i + k; j++) {
//                 sum +=arr[j];
//             }
//             if (sum > MaxSum) {
//                 MaxSum = sum;
//             }
//         }
//         System.out.println(MaxSum);
//     }
// }


public class SumOfMaxSumArray {

    public static void main(String[] args) {
        int[] arr ={3,4,1,6,7,9,10,7,6,2};
        int k = 3;
        subarray(arr, k);
    }
    public static void subarray(int[] arr, int k){
        int left = 0;
        int sum = 0;
        int maxsum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            while (i - left + 1 > k) {
                sum = sum - arr[left];
                left++;
            }
            if (i - left + 1 == k) {
                if (sum > maxsum) {
                    maxsum = sum;
                }
            }
        }
        System.out.println(maxsum);
    }
}
