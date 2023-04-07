public class tiling{
    public static int tilingproblem(int n){//2*n (floor size)
    //base case
    if(n==0 || n==1){
        return 1;
    }
    //kaam
    //vertical choice
    int fnm1 = tilingproblem(n-1);

    //horizontal choice
    int fnm2 = tilingproblem(n-2);

    int totways = fnm1 + fnm2 ;
    return totways;

    }
    public static void main(String args[]){
        System.out.println(tilingproblem(11));
    }
}