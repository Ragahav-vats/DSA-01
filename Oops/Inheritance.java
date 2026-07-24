class shape { // base class
    String color;
}
class Triangle extends shape { // derive class

}
public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
        System.out.println(t1.color);
    }
}