import java.util.*;
public class sup{
    public static void main(String args[]){
        horse h = new horse();
        System.out.println(h.color);

    }
}
class animal{
    String color;
    animal(){
        System.out.println("animal constructor is called");
    }
}
class horse extends animal{
    horse(){
        super.color= "brown";
        System.out.println("horse constructor is called");
    }
}