public class Planttrees {

    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 0, 1};
        int count = 1; 
        
        boolean result = plants(arr, count);
        System.out.println(result);

        System.out.print("Updated flowerbed: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean plants(int[] arr, int count) {
        for (int i = 0; i < arr.length; i++) {
            
            // int prev = (i == 0) ? 0 : arr[i - 1];
            // int next = (i == arr.length - 1) ? 0 : arr[i + 1]; 
            
            int prev;
            if (i == 0) {
              prev = 0; 
            } else {
                prev = arr[i - 1];
            }

            int next;
            if (i == arr.length - 1) {
              next = 0; 
            } else {
            next = arr[i + 1]; 
            }

            if (arr[i] == 0 && prev == 0 && next == 0) { 
                arr[i] = 1; 
                count = count -1 ;
                if (count == 0) {
                    return true; 
                }
                
            }
        }
        return false;
        
    }
}

