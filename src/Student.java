public class Student {
    String Name;

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public static void main(String[] args) {
        Student S = new Student();
        S.setName("jahnavi");
        System.out.println(S.getName());
    }
}