import java.util.*;
public class strings{
    public static void main(String args[]){
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2 = new String("xyz");

        //Strings are IMMUTABLE 

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();   //next will print only one word
        System.out.println(name); //nextLine will print whole line.


        String fullName=name;
        System.out.println(fullName.length());


        //concatenation
        String firstName="vedanshi";
        String LastName="bansal";
        String fullName2 =  firstName + " " + LastName;
        System.out.println(fullName2);
        System.out.println(fullName2.charAt(0));
        

    }
}