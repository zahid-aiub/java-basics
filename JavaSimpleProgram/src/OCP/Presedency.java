package OCP;

public class Presedency {
    public void m() {
        System.out.println("In class Presedency");
    }
}

interface B {
    int x = 10;
    default void increase() {

    }
    default void m() {
        System.out.println("In interface B");
    }
}

class Main extends Presedency implements B {
    public static void main(String[] args) {

    }
    @Override
    public void m() {
        super.m();
    }
}


