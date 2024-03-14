package othersAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubConjuntosBackTracking {

    public SubConjuntosBackTracking() {}

    public List<List<Integer>> getSubConjuntos(int[] array, int n) {
        List<List<Integer>> subconjuntos = new ArrayList<>();

        if (array.length == 0 || n == 0) return null;
        if (array.length == 1) {
            subconjuntos.add(new ArrayList<>(array[0]));
            return subconjuntos;
        };

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1) break;
            if (array[i] == array[i+1]) return null;
        }

        subconjuntos = solution(array, n);

        return subconjuntos;
    }


    private List<List<Integer>> solution(int[] array, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subConjuntoAtual = new ArrayList<>();
        backtrack(array, n, 0, subConjuntoAtual, result);
        return result;
    }

    private void backtrack(int[] array, int n, int start, List<Integer> subConjuntoAtual, List<List<Integer>> result) {
        if (subConjuntoAtual.size() == n) {
            result.add(new ArrayList<>(subConjuntoAtual));
            return;
        }

        for (int i = start; i < array.length; i++) {
            subConjuntoAtual.add(array[i]);
            backtrack(array, n, i + 1, subConjuntoAtual, result);
            subConjuntoAtual.remove(subConjuntoAtual.size() - 1);
        }
    }

}
