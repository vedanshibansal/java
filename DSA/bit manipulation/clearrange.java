import java.util.*;
public class clearrange{
    public static int clearibits(int n , int i , int j){
    int a = ((~0)<<(j+1));
    int b = (1<<i)-1;
    int bitmask = a|b;
    return n & bitmask;
}
public static void main (String args[]){
    System.out.println(clearibits(15,2,4));

}
}