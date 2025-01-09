class Student {
    String name;
    int id;
    String classNo;
    String dept;

    public void Talking() {
        System.out.println("Students are Talking");
    }

    public void MakeNoise() {
        System.out.println("Students are Making Noise");
    }

    public void Coding() {
        System.out.println("Students are Coding");
    }
    
}

public class Test_OPPS{
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        Student std1 = new Student();
        
        System.out.println(std1.name);
        
        std1.name="Bhanu Prasad";
        std1.id = 181;
        std1.classNo = "G2";
        std1.dept = "CSE";
        //System.out.println(std1);

        std1.Talking();
        std1.MakeNoise();
        std1.Coding();
        

    }
}
