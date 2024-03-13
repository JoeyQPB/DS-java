package fibonacci;

public class Fibonacci {

    public Fibonacci () {}

    public Long getElement(int position) {
        if (position == 0) return 0L;
        if (position == 1) return 1L;

        long a = 1L;
        long b = 0L;
        Long c = null;

        for (int i = 0; i < position-1; i++) {
            c = a + b;
            b = a;
            a = c;
        }

        return c;
    }

}
