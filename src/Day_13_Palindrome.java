public class Day_13_Palindrome {
    public static void main(String[] args) {
        int num = 12321;
        isPalindrome(num);
        
    }

    public static void isPalindrome(int num) {
        if (num < 0) {
            return;
        }
        int num_copy = num; 
        int reverse = 0;

        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        if (num_copy == reverse) {
            System.out.println(reverse);
            System.out.println("Given Number is Palindrome");
        } else {
            System.out.println(reverse);
            System.out.println("GIven Number is Not a Palindrom");
        }

    }
    
}
