import java.util.*;
public class compare{
public static void main(String args[]){
    String s1="tony";
    String s2="tony";
    String s3= new String("tony");
    if(s1==s2){
         System.out.println("strings are equal");
    }else{
         System.out.println("strings are not equal");
    }
    if(s2==s3){
         System.out.println("strings are equal");
    }else{
         System.out.println("strings are not equal");
    }
    if(s1.equals(s3)){
         System.out.println("strings are equal");
    }else{
        System.out.println("strings are not equal");
    }

}
}