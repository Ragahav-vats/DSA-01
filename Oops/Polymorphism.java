 class Car {
        int seat;
        String model;

    public void printInfo(int seat) { // compile time polymorphism 
        System.out.println(seat);
    }
    public void printInfo(String model) { // compile time polymorphism 
        System.out.println(model);
    }
    public void printInfo(int seat , String model) { // compile time polymorphism 
        System.out.println(seat + " " + model);
    }

    }

public class Polymorphism {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.seat = 5;
        c1.model = "BMW";
        c1.printInfo(c1.seat);
        c1.printInfo(c1.model);
    }
}