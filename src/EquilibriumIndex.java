public class EquilibriumIndex {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 5, 6, 65};
        isEquilibrium(arr);

    }
    public static void isEquilibrium(int[] arr) {
        
    int totalsum = 0;
    for (int i = 0; i < arr.length; i++) {
        totalsum = totalsum + arr[i];
    }

    int leftsum = 0;
    for (int i = 0 ; i < arr.length; i++) {
        int rightsum = 0;
        rightsum = totalsum - arr[i] - leftsum;
        if (leftsum == rightsum) {
            System.out.println("The Equilibrium Index is : "+ i);
            System.out.println("The value of the Equilribrium is : "+arr[i]);
        }
        leftsum = leftsum + arr[i];
    }
    }
}
