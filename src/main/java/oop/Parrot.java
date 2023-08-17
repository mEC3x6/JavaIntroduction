package oop;

public class Parrot extends Pet{

    public Parrot (Breed breed){
        super (breed);
    }
    public void talk(){
        System.out.println(getName() + " Hello i`m Polly");
    }
    public void eat() {
        System.out.println(getName() + " is eating !");
    }
    public void fly(){
        System.out.println(getName() + "is flying");
    }
}