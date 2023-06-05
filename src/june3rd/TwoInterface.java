package june3rd;

interface Addition {
    void twoNumbers(int a, int b);
}
interface Multiplication {
    void threeNumbers(int x, int y, int z);
}
class Expression implements Addition,Multiplication{
    public void twoNumbers(int a, int b){
        System.out.println(a+b);
        }

    @Override
    public void threeNumbers(int x, int y, int z) {
        System.out.println(x*y*z);


    }
}
public class TwoInterface{
    public static void main(String[] args) {
        Expression c = new Expression();
        c.twoNumbers(5, 6);
        c.threeNumbers(3, 4, 5);

    }
}

