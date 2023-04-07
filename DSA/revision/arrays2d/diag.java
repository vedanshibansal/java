import java.util.*;
public class diag{
    public static int diagsum(int matrix[][]){
        int sum = 0;
        for(int i=0; i<matrix.length ; i++){
            //primrary diagonal  i+j
            sum += matrix[i][i];
            //secondary diagonal i+j=n-1
            //j=n-i-1
            if(i!=matrix.length-1-i){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        System.out.println("the sum of diagonal is : "+sum);
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={
                         {1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        diagsum(matrix);
    }                     
}