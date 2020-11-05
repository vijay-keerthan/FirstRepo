public class Vehicle {
    void run(){
        System.out.println("vehicle is running.....!!!");
    }
}
class Bike extends Vehicle {
    void run(){
        System.out.println("Bike is running...!!!!");
    }
    public static void main(String[] args){
        System.out.println("Main started...!!!");
        Vehicle vb = new Bike();
        Vehicle v = new Vehicle();
        Bike b = new Bike();
        vb.run();
        v.run();
        b.run();
    }
}
