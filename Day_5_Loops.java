public class Day_5_Loops {
    public static void main(String[] args) {
        String s = "dhdhdd";
        System.out.println(s.length());

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(3));

        // substring: A part of a String

        String a = "Bhanu Prasad";
        System.out.println(a.substring(0));
        System.out.println(a.substring(6, 12));
        System.out.println(a.substring(7,7));
        System.out.println(a.substring(2,3));
        System.out.println("hello".equals("Hello"));
        System.out.println(a.length() - 1);

        //Find last 3 characters

        String str = "Classroom";
        System.out.println(str.substring(6,9));
        System.out.println(str.length() - 3);
        System.out.println(str.substring(str.length()-3));

        // String concatenation 

        System.out.println("hello" + 2 +2);
        System.out.println("Hello" + (2+2));

        String firstname = "Bhanu";
        String lastname = "Prasad";
        String Fullname = firstname + " " + lastname;
        System.out.println(Fullname);
        
        // Loops

        String name = "Bhanu";
        for (int i = 1 ; i <= 10; i ++) {
            System.out.println("Bhanu");
        }


        int i = 1;
        while (i <= 5) {
            System.out.println("Prasad");
            i++;
            
        }
    }
}
