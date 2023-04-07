public class  copy{
    public static void main(String args[]){
        Student s1 = new Student();
       s1.name= "veda";
       s1.roll = 456;
       s1.password = "abcd";
       s1.marks[0] = 100;
       s1.marks[1] = 90;
       s1.marks[2] = 80;
       

       Student s2 = new Student(s1);
       s2.password = "xyz";
       s1.marks[2] = 100;
       for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
       }

    }
}

class Student{
    String name;
    int roll ;
    String password;
    int marks[];

    //copy constructor
//shallow copy constructor

// prints 100
//90
//100
    /*Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll ;
        this.marks = s1.marks;
    }*/

    //deep copy constructor
    //prints
    //100
    //90
    //80
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name ;
        this.roll = s1.roll ;
        for(int i=0; i<marks.length; i++){
        this.marks[i] = s1.marks[i];
       }
    }

    //non parameterized constructor
    Student(){
        marks = new int[3];
        System.out.println("constructor is called...");
    }


    //parameterized 
    Student(String name){
        marks = new int[3];
        this.name = name;
        //System.out.println(name);
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll ;
       // System.out.println(roll);
    }

}