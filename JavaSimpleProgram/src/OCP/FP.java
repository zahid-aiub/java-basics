package OCP;

public interface FP {
    void addSum(int a, int b);
}

interface C {
    void add();
}

interface M extends C, FP {

}
