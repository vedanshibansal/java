import java.util.*;
public class oops{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        //p1.setcolor("yellow");
        p1.setcolor("yellow");
        System.out.println(p1.getcolor());


        /*BankAccount myAcc = new BankAccount();
        myAcc.username = "veda";
        myAcc.setPassword("adbfvdf");
        System.out.println(myAcc.password); */
    }
}

/*class BankAccount{
    public String username ;
    private String password ;
    public void setPassword(String newPassword){
        password = pwd;
    }
}*/


class Pen{
    //prop func
    private String color;
    private int tip;

    String  getcolor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setcolor(String newcolor){
        this.color = newcolor;
    }
    void setTip(int newTip){
       this.tip = tip;
    }
}

/*class student{
    String name;
    int age;
    float percentage ;

    void calculatepercentage(int maths , int phy , int chem){
        percentage = (phy+chem+maths)/3;
    }
}*/