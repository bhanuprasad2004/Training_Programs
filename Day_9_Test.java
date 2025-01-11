public class Day_9_Test{
    public static void main(String[] args) {
        int[] arr = new int[5];

        // Student s1 = new Student();
        // Student s2 = new Student();
        

        // s1.name = "bhanu";
        // s1.id = 181;
        // s1.age = 20;
        // s1.branch = "cse";

        
        // s2.name = "bhanu";
        // s2.id = 181;
        // s2.age = 20;
        // s2.branch = "cse";

        // System.out.println(s1 == s2);

        Student s1 = new Student("Bhanu", 181, 20, "CSE");
        System.out.println(s1);
        Student s2 = new Student("Mani", 388, 20, "CSE");
        System.out.println(s2);

    }
    
}
