public class EquilibriumIndex {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 5, 6, 65};
        isEquilibrium(arr);

    }
    public static void isEquilibrium(int[] arr) {
        

        for (int i = 0;i <=arr.length-1;i++) {
            int leftsum = 0;
            int rightsum = 0;
            for (int j = 0;j <= i-1; j++) {
                leftsum = leftsum + arr[j];
            }
            for (int k = i + 1; k <= arr.length-1;k++) {
                rightsum = rightsum + arr[k];
            }
        
        if (leftsum == rightsum) {
            System.out.println("Equilibrium Index Found at : " + i);
            System.out.println("The value Equilibrium Index is : "+ arr[i]);
            return;
        }
    } 
    
    System.out.println("Not Found");
    }
}
