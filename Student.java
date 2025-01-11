public class Student {

    String name;
    int id;
    int age;
    String branch;

    public Student(String name, int id, int age, String branch) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.branch = branch;
    }
   

    public void makenoise() {
        System.out.println("Students are making noise: ");
    }
    
    public void study() {
        System.out.println("Students are studying");
    }

    public String toString() {
        return this.name + " " + this.id;
    }
}

