// abstraction

abstract class Animal{
    public abstract void sound();
}

class Dog extends Animal{
    public void sound(){
        System.out.println("the sound is : bark!");
    }
}

public class abstraction{
public static void main(String[]args){
    Animal myDog = new Dog();
    myDog.sound();
}
}