import java.util.*;
public class twice{
    public static int dup(int[] nums){
        for(int i=0; i<nums.length-1 ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i] == nums[j]){
                    return 1;
                }
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        int index = dup(nums);
         if(index == -1){
            System.out.println("No duplicate found.");

        }else{
            System.out.println("duplicate found .");
        }
    }
}