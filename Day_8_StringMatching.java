import java.util.*;

public class Day_8_StringMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }
        Solution sol = new Solution();
        List<String> result = sol.stringMatching(words);

        System.out.println("Strings that are substrings of other strings: " + result);
    }
}

class Solution {
    public List<String> stringMatching(String[] words) {
       List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String sOne = words[i];
            for (int j = 0; j < words.length; j++) {
                String sTwo = words[j];
                if (i != j && sOne.length() < sTwo.length()) {
                    if (isSubstring(sOne, sTwo)) {
                        result.add(sOne);
                        break;
                    }
                }
            }
        }
        return result;
    }

    public boolean isSubstring(String sOne, String sTwo) {
        for (int i = 0; i <= sTwo.length() - sOne.length(); i++) {
            if (sOne.equals(sTwo.substring(i, sOne.length() + i))) {
                return true;
            }
        }
        return false;
    }
}

