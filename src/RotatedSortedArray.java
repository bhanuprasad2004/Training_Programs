public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {8, 9, 18, 45, 2, 5};
        int target = 9;
        search(arr, target);

    }
    public static void search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low+high) / 2;

            if (arr[mid] == target) {
                System.out.println("Target Index is : " +mid);
                System.out.println("Target value is : "+arr[mid]);
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
    }
}