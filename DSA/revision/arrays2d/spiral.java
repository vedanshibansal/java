import java.util.*;
public class spiral{
    public static void printspiral(int matrix[][]){
        int StartRow = 0;
        int StartCol = 0;
        int endRow = matrix.length - 1 ;
        int endcol = matrix[0].length- 1 ;

        while(StartRow <= endRow && StartCol <= endcol){
            //top
            for(int j=StartCol ;j<=endcol;j++){
                System.out.println(matrix[StartRow][j]+" ");
            }
            //right
            for(int i=StartRow+1 ;i<=endRow;i++){
                System.out.println(matrix[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1 ;j>=StartCol;j--){
                if(StartRow == endRow){
                    break;
                }
                System.out.println(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1 ;i>=StartRow+1;i--){
                if(StartCol == endcol){
                    break;
                }
                System.out.println(matrix[i][StartCol]+" ");
            }
            StartCol++;
            StartRow++;
            endcol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String args[]){
        int matrix[][]={
                         {1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        printspiral(matrix);
    }
}