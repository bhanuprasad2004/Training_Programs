import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

// public class NextGreaterNUmber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter size of Array");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter " + n + " Elements");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int[] ngn = new int[n];

//         for (int i = 0; i < arr.length; i++) {
//             ngn[i] = -1;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] > arr[i]) {
//                     ngn[i] = arr[j];
//                     break;
//                 }
//             }
//         }
//         //System.out.println(ngn);
//         for (int i = 0; i < ngn.length; i++) {
//             System.out.print(ngn[i] + " ");
//         }
//     }
// }



public class NextGreaterNUmber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> result = new HashMap<>();
        Stack<Integer> stk = new Stack<>();

        for (int i = arr.length - 1; i >= 0 ; i--) {
            while (!stk.isEmpty() && stk.peek() < arr[i]) {
                stk.pop();
            }
            if (stk.isEmpty()) {
                result.put(arr[i], -1); 
            } else {
                result.put(arr[i], stk.peek()); 
            }
            stk.push(arr[i]);
        }
        System.out.println("New Result");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(result.get(arr[i]) + " ");
        }
    }
}