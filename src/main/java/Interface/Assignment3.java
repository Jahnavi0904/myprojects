package Interface;

class Student{
    static int strength;
    static{
        strength=count();
        }
        static int count(){
         return 10;
        }
    static int getstrength(){
        return strength;
        }

}

public class Assignment3 {
    public static void main(String[] args){

        System.out.println(Student.getstrength());

    }
}
