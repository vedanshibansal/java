import java.util.*;
public class strings2{
    public static void getLetters(String str){
        for(int i=0;i<str.length();i++){
             System.out.print(str.charAt(i)+" ");
        }
         System.out.println();
    }
    public static void main(String args[]){
        String first="veda";
        String last="bansal";
        String fullName=first+" "+last;
        getLetters(fullName);
    }
}