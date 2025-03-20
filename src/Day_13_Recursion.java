// public class Day_13_Recursion {
//     public static void print5to1(int num1) {
//         if (num1 == 0) {
//             return;
//         }
//         System.out.println(num1);
//         print5to1(num1 - 1);
//     }
//     public static void print1to5(int num2){
//         if (num2 == 6) {
//             return;
//         }
//         System.out.println(num2);
//         print1to5(num2 + 1);
//     }
//     public static void main(String[] args) {
//         int num1 = 5;
//         System.out.println("Numbers from 5 to 1");
//         print5to1(num1);
//         System.out.println();
//         int num2 = 1;
//         System.out.println("Numbers from 1 to 5");
//         print1to5(num2);
//     }
// }
public class Day_13_Recursion {
    public static void Even(int n) {
        if (n < 0) {
            return;
        }
        if (n % 2 == 0) {
            System.out.println(n);
        }
        Even(n - 1);
    }
    public static void main(String[] args) {
        Even(10);
    }
}



// class Main {
    
//     public static void Even(int n) {
//         if (n < 0) {
//             return;
//         }
//         if (n % 2 == 0) {
//             System.out.println(n);
//         }
//         Even(n - 1);
//     }
//     public static void main(String[] args) {
//         Even(10);
//     }
// }


// class Main {
//     public static void Odd(int n) {
//         if (n < 0) {
//             return;
//         }
//         if (n % 2 != 0) {
//             System.out.println(n);
//         }
//         Odd(n - 1);
//     }
//     public static void main(String[] args) {
//         Odd(10);
//     }
// }


// class Main {
    
//     public static void main(String[] args) {
//         Multiples(30);
//     }
//     public static void Multiples(int n) {
//         if (n < 0) {
//             return;
//         }
//         if (n % 5 == 0) {
//             System.out.println(n);
            
//         }
//         Multiples(n - 1);
//     }
// }


class Main {
    
    public static void main(String[] args) {
        Divide(30);
    }
    public static void Divide(int n) {
        if (n < 0) {
            return;
        }
        if (n % 7 == 0) {
            System.out.println(n);
            
        }
        Divide(n - 1);
    }
}

