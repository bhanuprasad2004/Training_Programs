import java.util.HashMap;
import java.util.Stack;

public class Leetcode496 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < nums2.length ; i++) {
            while (!stk.isEmpty() && stk.peek() < nums2[i]) {
                map.put(stk.pop(),nums2[i]);
            }
            stk.push(nums2[i]);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                result[i] = map.get(nums1[i]);
            } else {
                result[i] = -1;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }   
    }
}
