import java.util.*;
public class inbuilt{
    public static void printarr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
    
    Integer arr[] = {5,4,1,3,2};
    //Arrays.sort(arr);
    //tc = 0(n log n)
    //Arrays.sort(arr,0,3);
    // Arrays.sort(arr, Collections.reverseOrder());
    // Arrays.sort(arr,0,3, Collections.reverseOrder());
    printarr(arr);

    }
}