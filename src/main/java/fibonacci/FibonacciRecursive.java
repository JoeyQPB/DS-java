package fibonacci;

public class FibonacciRecursive {

    public FibonacciRecursive() {}

    public Long getElement(int p) {
        if (p == 0) return null;
        if (p == 1 || p == 2) return 1L;
        return getElement(p - 1) + getElement(p - 2);
    }
}
