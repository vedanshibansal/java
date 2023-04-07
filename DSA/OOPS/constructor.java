public class constructor{
    public static void main(String args[]){
        Student s1 = new Student("veda");


        //jo "veda"likha h woh name wale function ke liye hai

        // isme aayega , function call hoga aur niche jayega
        //System.out.println(s1.name);

    }
}
class Student{
    String name;
    int roll;

    //yahan aayega , aur phir isme jo print kara rha h woh ho jayega

    Student(String name) {
       //this.name = name;
       System.out.println("constructor is called....");
    }
}