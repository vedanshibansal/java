public class inheritance{
    public static void main(String args[]){
        //single level
   // Fish shark = new Fish();
    //shark.eat();

//multi level
    /*Dog dobby = new Dog();
    dobby.eat();
    dobby.legs=4;
    System.out.println(dobby.legs); */

    //heirarichal
   /* bird birdd = new bird();
    birdd.breathe();
    birdd.fly(); */
    }
}

//base class
class animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//single level inheritance
//derived class
/*
class Fish extends animal{
    int fins;
    void swim(){
        System.out.println("swim in water.");
    }
}*/

//multi level

/*class Mammal extends animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
}*/

//heirarchial 

/*class Mammal extends animal{
    void walk(){
        System.out.println("walks");
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
}*/