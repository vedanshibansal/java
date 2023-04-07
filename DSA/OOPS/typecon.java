public class typecon{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("veda");
        Student s3 = new Student(123);

    }
}

class Student{
    String name;
    int roll ;

    //non parameterized constructor
    Student(){
        System.out.println("constructor is called...");
    }


    //parameterized 
    Student(String name){
        this.name = name;
        System.out.println(name);
    }
    Student(int roll){
        this.roll = roll ;
        System.out.println(roll);
    }

}