public class  poly{
    public static void main(String args[]){
        deer d = new deer();
        d.eat();
        /*calculator calc = new calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5,(float)2.5));
        System.out.println(calc.sum(1,2,3));
        */

    }
}


class animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class deer extends animal{
    void eat(){
        System.out.println("eats grass");
    }
}
//method overloading
/*class calculator{
    int sum(int a , int b){
        return a+b ;
    }
    float sum(float a , float b){
        return a+b ;
    }
    int sum(int a , int b , int c){
        return a+b+c;
    }
}*/