package Oops;
public abstract class Department {


    public abstract int getDepartmentsize();

}
    class Section extends Department {
        public int getDepartmentsize() {
            return 20;
        }

    }
