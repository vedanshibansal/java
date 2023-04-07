//bubblesort
import java.util.*;
public class bubble{
    public static void bubblesort(int arr[]){
        for(int turn = 0; turn<arr.length-1 ; turn ++){//n times
            for(int j=0; j<arr.length-1-turn;j++){//n-1 times
            //tc= 0(n)
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {6,5,4,7,8};
        bubblesort(arr);
        printarr(arr);
    }
}