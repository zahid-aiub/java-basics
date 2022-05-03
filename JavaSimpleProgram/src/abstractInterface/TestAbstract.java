package abstractInterface;

public abstract class TestAbstract extends DemoAbstract {

    @Override
    public void abstractClassMethod() {
        System.out.println("implement from TestAbstract");
    }
}



/*
*
*  It's an important topic to understand Abstraction
*
* */

interface A {
    void a();

    void b();

    void c();

    void d();
}

abstract class B implements A {
    public void c() {
        System.out.println("I am c");
    }
}

class M extends B {
    public void a() {
        System.out.println("I am a");
    }

    public void b() {
        System.out.println("I am b");
    }

    public void d() {
        System.out.println("I am d");
    }
}

class Test5 {
    public static void main(String args[]) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
