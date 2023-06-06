package june5th;

public class Fibbonaccii2 {
    public static void main(String[] args){
        int a=0 ,b=1,n=10;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<=n;i++) {
            int temp=a;
            a=b;
            b=temp+b;
            System.out.println(b);
        }
    }
}
