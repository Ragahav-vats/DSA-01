abstract class Animal {
    abstract void walk();
}
class Horse extends Animal{
  public void walk() {
       System.out.println("walk in 4 legs");
    }  
}
class Chicken extends Animal{
  public void walk() {
       System.out.println("walk in 2 legs");
    }  
}
public class Abstract { // means important cheez ko show krna baaki ko hide krna
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}