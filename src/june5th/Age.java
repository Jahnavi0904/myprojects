package june5th;
class Person{
    public void MyFunction(int age) {
        if (age > 19) {
            System.out.println("person is adult");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Person is a teen");
        } else {
            System.out.println("person is a kid");
        }
    }
}

public class Age {
    public static void main(String[] args){
        Person identity=new Person();

       identity.MyFunction(20);
       identity.MyFunction(10);
       identity.MyFunction(15);
    }
}
