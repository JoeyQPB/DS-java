package fibonacci;

import java.util.ArrayList;

public class FibonacciDP {

    private static final ArrayList<Long> fibonacciList = new ArrayList<>();

    public FibonacciDP () {}

    public static Long getElement(int p) {
        if (fibonacciList.size() <= p) {
            for (int i = fibonacciList.size(); i <= p; i++) {
                if (i <= 0) {
                    fibonacciList.add(0L);
                } else if (i == 1 || i == 2) {
                    fibonacciList.add(1L);
                } else {
                    fibonacciList.add(fibonacciList.get(i - 1) + fibonacciList.get(i - 2));
                }
            }
        }

        return fibonacciList.get(p);
    }
}
