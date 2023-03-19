
// abstract class
// similar to interface
// empty function inside abstract class , abstract method cannot have objects
// use regular class to extend abstract class and override methods
abstract class Car{

    // abstract class can have abstract method : use abstract keyword
    // regular method too

    public abstract void engine();

    public void brand(){
        System.out.println("This is Honda Car ! tada");
    }

}

class Bike extends Car{
    public void engine(){
        System.out.println("this is bike engine ! tada");
    }
}

public class Main {
    public static void main(String[] args) {

      Bike bike1 = new Bike();
      bike1.engine();
      bike1.brand();
    }
}