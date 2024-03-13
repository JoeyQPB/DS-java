package fibonacci;

import java.util.ArrayList;

public class FibonacciDP {

    private final ArrayList<Long> fibonacciList = new ArrayList<>();

    public FibonacciDP () {}

    public Long getElement(int p) {
        if (fibonacciList.get(p) == null) {
            if (p == 0) fibonacciList.add(p, -1L);
            if (p == 1 || p == 2) fibonacciList.add(p, 1L);

            fibonacciList.add(p, getElement(p-1) + getElement(p-2));
        }

        return fibonacciList.get(p);
    }
}
