package june3rd;

class Jungle{
    protected String name;
    public Jungle(String name){
        this.name = name;
    }
}
class Animal extends Jungle{

    public String type;
    public Animal(String name,String type) {
        super(name);
        this.type = type;
    }
    public Animal(String type){
        super("unknown");
        this.type=type;
        }
        public void Display(){
        System.out.println(name +" is a "+ type + " animal");
        }

}
public class Assignment2 {
    public static void main(String[] args){
        Animal x=new Animal("lion","carnivorous");
        x.Display();

    }
}
