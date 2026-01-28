//Class & Object
class Car {
    String brand;
    int speed;
    void drive() {
        System.out.println("Car is driving");
    }
}

//Inheritance
class Animal1{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog1 extends Animal1{
    void bark(){
        System.out.println("Barking...");
    }
}

//Encapsulation
class BankAccount{
    private double balance;
    public double getBalance(){
        return balance;
    }
    void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
}

//Polymorphism
//Compile-time
class MathUtil{
    int add(int a, int b){
        return a + b;
    }
    double add(double a, double b){
        return a + b;
    }
}

//Runtime
class Animal2{
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog2 extends Animal2{
    void sound(){
        System.out.println("Bark");
    }
}

//Abstraction
abstract class Vehicle{
    abstract void start();
    void fuel(){
        System.out.println("Fueling...");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike starts with kick");
    }
}

//Interface
interface Payment{
    void pay();
}
class UPI implements Payment{
    public void pay(){
        System.out.println("Paying via UPI");
    }
}

//Constructor
class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    void display() {
        System.out.println("Student name: " + name);
    }
}

public class Main{
    public static void main(String[] args){
        //Class & Object
        Car c = new Car();
        c.brand = "";
        c.speed = 400;
        c.drive();

        //Inheritance
        Dog1 d1 = new Dog1();
        d1.eat();
        d1.bark();

        //Encapsulation
        BankAccount b = new BankAccount();
        System.out.println(b.getBalance());
        b.deposit(1000);
        System.out.println(b.getBalance());

        //Polymorphism
        //Compile-time
        MathUtil m = new MathUtil();
        System.out.println(m.add(10, 20));
        System.out.println(m.add(10.25, 20.75));

        //Runtime
        Animal2 d2 = new Dog2();
        Animal2 a = new Animal2();
        d2.sound();
        a.sound();

        //Abstraction
        Vehicle v = new Bike();
        v.start();
        v.fuel();

        //Interface
        Payment p = new UPI();
        p.pay();

        //Constructor
        Student s1 = new Student("XYZ");
        s1.display();
    }
}