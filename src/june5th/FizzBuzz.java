package june5th;
class Numbers{
    public void function(int number){
        if((number%3==0) && (number%5==0)){
            System.out.println("FizzBuzz");
        }
        else if(number%3==0){
            System.out.println("Fizz");
        }
        else if(number%5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(number);
        }
    }

    }
public class FizzBuzz {
    public static void main(String[] args){
        Numbers id = new Numbers();
        for(int i=1;i<=100;i++){
            id.function(i);
        }
    }
}
