package Simpleprograms;

public class Reverse {
    public static void main(String[] args){
        int x=78870980;
        int y=0;
       while(x>0) {
           y = y * 10;
           y = y+(x % 10);
           x = x / 10;
       }
           System.out.println(y);

    }
}
