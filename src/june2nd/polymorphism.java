package june2nd;


class Form{
    public void state() {
        System.out.println("Displays in which state");
    }
}

// Child class
class Ice extends Form {
    public void state() {
        System.out.println("ice is in solid");
    }
}

// Child class
class Water extends Form {
    public void state() {
        System.out.println("water is in liquid");
    }
}
