public class Day_6_Problems {
    public static void main(String[] args) {
        for (int i = 1; i <=4 ; i++) {
            System.out.print("*" + " ");
        }

        System.out.println();
        System.out.println();
        

        for (int i = 0; i <=2; i++) {
            for (int j = 0; j <=3; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        // System.out.println();
        // System.out.println();

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();
        

        int[] arr = new int[5];
        System.out.println(arr);
    }
}
