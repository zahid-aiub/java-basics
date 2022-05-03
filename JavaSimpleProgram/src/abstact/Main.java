package abstact;


abstract class First {
    public void m1() {
        System.out.println("First M1");
    }

    public abstract void am1();
    abstract void am2();
}

abstract class Second extends First {
    public void m1() {
        System.out.println("Second M1");
    }

    public abstract void am1();
    abstract void am2();
}
public class Main {
    public static void main(String[] args) {
        First s = new Second() {
            @Override
            public void am1() {

            }
            @Override
            void am2() {

            }
        };
    }
}
