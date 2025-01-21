import java.util.Arrays;

public class Day_10_MergeSort {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 6, 8, 9, 100};
        int[] nums2 = {4, 5, 9, 11, 20, 25, 120};
        int m = nums1.length;
        int n = nums2.length;
        System.out.println(Arrays.toString(mergeArrays(nums1, m, nums2, n)));
    }

    public static int[] mergeArrays(int nums1[], int m, int[] nums2, int n) {
        int[] newArr = new int[m + n];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (p1 < m && p2 < n) {
            if (nums1[p1] <= nums2[p2]) {
                newArr[p3++] = nums1[p1++];
            } else {
                newArr[p3++] = nums2[p2++];
            }
        }

        while (p1 < m) {
            newArr[p3++] = nums1[p1++];
        }

        while (p2 < n) {
            newArr[p3++] = nums2[p2++];
        }

        return newArr;
    }
}

