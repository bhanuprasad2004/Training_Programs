public class Day_13_Recursion {
    public static void print5to1(int num1) {
        if (num1 == 0) {
            return;
        }
        System.out.println(num1);
        print5to1(num1 - 1);
    }
    public static void print1to5(int num2){
        if (num2 == 6) {
            return;
        }
        System.out.println(num2);
        print1to5(num2 + 1);
    }
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("Numbers from 5 to 1");
        print5to1(num1);
        System.out.println();
        int num2 = 1;
        System.out.println("Numbers from 1 to 5");
        print1to5(num2);
    }
}
