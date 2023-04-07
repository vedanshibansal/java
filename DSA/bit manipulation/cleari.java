import java.util.*;
public class cleari{
    public static int clearibit(int n ,int i){
        int bitmask = ~(0)<<i;
        return n&bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearibit(10,2));
    }
}
