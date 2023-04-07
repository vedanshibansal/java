public class fact{
    public static int printfact(int n){
        if(n==0){
            
            return 1;
        }
        int fnm1 = printfact(n-1);
        int fn = n * printfact(n-1);
        return fn ;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.print(printfact(n));

    }
}