public class hybrid{
    public static void main(String args[]){
        Dog dobby = new Dog();
    dobby.eat();
    

    bird birdd = new bird();
    birdd.breathe();
    birdd.fly();

    }
}
class animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal extends animal{
    void walk(){
        System.out.println("walks");
    int legs;    
    }
}

class Fish extends animal{
    void swim(){
        System.out.println("swims");
    }
}
class bird extends animal{
    void fly(){
        System.out.println("flies");
    }
}
class Dog extends Mammal{
    String breed;
}
class cat extends Mammal{
    String breed;
}
class peacock extends bird{
    String feathers;
}
class shark extends Fish{
    String breed;
}