import java.util.*;

public class ls{
    public static int linearsearch1(int numbers[],int key){
        
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main (String args[]){
        int numbers[]= {2,4,6,8,10,12,14,16};
        int key = 16;

        int index = linearsearch1(numbers,key);
        if(index==-1){
             System.out.print("key not found");
        }else{
             System.out.print("key found at index "+index);

        }
        
        
    }
}