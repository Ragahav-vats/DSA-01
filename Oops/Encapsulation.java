class Student {

    private int age;

    public void setAge(int age) {

        if(age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation { // means cover the private data(variables) and methods
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setAge(23);

        System.out.println(s1.getAge());
    }
}