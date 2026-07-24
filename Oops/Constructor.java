class Student { // user define data type
    int age;
    String name;

    Student(int age, String name) { // constructor object construct krta h 
        this.age = age; // CurrentObject.val = ConstructorParameter.val
        this.name = name;
    }

    void display() {
        System.out.println(age+" "+name);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(23,"Krishna");
        Student s2 = new Student(24,"Mahadev");
        s1.display();
        s2.display();
        Student s3 = s1; // s3 is shallow copy of s1(s3 can controlled of s1)
        s3.display();
    }
}