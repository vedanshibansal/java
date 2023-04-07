import java.util.*;
public class updateith{
    public static int updateithbit(int n , int i , int newbit){
        
        int bitmask = newbit<<i;
        return n| bitmask;

    }
    public static void main(String args[]){
        System.out.println(updateithbit(10,2,1));
    }
}