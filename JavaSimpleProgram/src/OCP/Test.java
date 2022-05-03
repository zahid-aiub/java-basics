package OCP;

interface TestInterface {
    public abstract double calculate();
    public abstract int calculateTax();
    //default
    public default void checkBalance() {

    }
    static void getMoney() {

    }
}

public abstract class Test implements TestInterface {
    public abstract double calculate(double x);
}

class TestOne extends Test{

    void display () {
        System.out.println("Displaying------");
    }

    @Override
    public double calculate(double x) {
        return 0;
    }

    @Override
    public double calculate() {
        return 0;
    }

    @Override
    public int calculateTax() {
        return 0;
    }
}

class TestTwo extends TestOne {
    public static void main(String[] args) {
        TestTwo one = (TestTwo) new TestOne();
        one.display();
        one.calculate();
    }

}
