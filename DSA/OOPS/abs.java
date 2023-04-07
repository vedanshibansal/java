import java.util.*;
public class abs{
    public static void main(String args[]){
        /*horse h = new horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        chicken c = new chicken();
        c.eat();
        c.walk();
        */

        mustang myhorse = new mustang();

    }
}
abstract class animal{
    String color;

    animal(){
         System.out.println("animal constructor called");
        color = "brown";
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}
class horse extends animal{
    horse(){
         System.out.println("horse constructor....");
    }
    void changecolor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class chicken extends animal{
    void changecolor(){
        color = "light brown";
    }
    void walk(){
        System.out.println("walks on 8 legs");
    }
}
class mustang extends horse{
    mustang(){
         System.out.println("mustang constructor called...");
    }
}