public class fib{
    public static int fibb(int n){
        if(n==0 || n==1){
            
            return n;
        }
        int fnm1 = fibb(n-1);
        int fnm2 = fibb(n-2);
        int fn = fnm1 + fnm2 ;
        return fn ;
        
    }
    public static void main(String args[]){
        int n = 5;
        System.out.print(fibb(n));

    }
}