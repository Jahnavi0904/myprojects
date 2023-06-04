package june2nd;

public class run {
    public static void main(String[] args) {
        Section count = new Section();
        int departmentsize = count.getDepartmentsize();
        System.out.println("departmentsize:" + departmentsize);

        Product type = new Product();
        type.setPrice(40);
        System.out.println("Price: " + type.getPrice());
        System.out.println(type.getPrice(3));

        Form form1 = new Ice();
        Form form2 = new Water();

        form1.state(); // Calls the overridden method in Dog class
        form2.state();


    }
}