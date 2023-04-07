public class power1{
    public static int optimizedpower(int a ,int n){

        if(n==0){
            
            return 1;
        }
       // int halfPowerSq = optimizedpower(a,n/2)*optimizedpower(a,n/2);

       int halfPower = optimizedpower(a,n/2);
       int halfPowerSq= halfPower * halfPower ;


        //n is odd
        if(n % 2 != 0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String args[]){
        
        System.out.print(optimizedpower(2,5));

    }
}