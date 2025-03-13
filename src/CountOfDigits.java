public class CountOfDigits {
    public static void main(String[] args) {
         int num = 121;
         int num_copy = num;
         System.out.println(divides(num, num_copy));

    }
    public static int divides(int num, int num_copy) {
        int count = 0;
        //int digit = 0;
        while (num != 0) {
           int digit = num % 10;
            if(digit != 0 && num_copy % digit == 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }

}
