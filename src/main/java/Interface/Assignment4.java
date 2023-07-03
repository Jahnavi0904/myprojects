package Interface;

final class Login{
     final String logininfo ="xyz";

    final void authorization(){
        System.out.println("Give authorization if logininfo matched:");
    }
}


public class Assignment4 {
    public static void main(String[] args){
        Login id=new Login();
        id.authorization();
        System.out.println(id.logininfo);

    }
}
