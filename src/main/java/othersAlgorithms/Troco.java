package othersAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Troco {

    private List<Integer> modeasDoTroco;

    class Change {
        int totalValue;
        int totalAdded;

        public Change(int value) {
            this.totalValue = value;
            this.totalAdded = 0;
        }

        public void addTotalAdded(int value) {
            this.totalAdded += value;
        }

        public void removeTotalAdded(int value) {
            this.totalAdded -= value;
        }

        public int isTheLimit() {
            if (totalValue == totalAdded) return 1;
            else if (totalValue < totalAdded) return -1;
            else return 0;
        }

    }

    public Troco () {
        this.modeasDoTroco = new ArrayList<>();
    };

    public void solution(int valor, int[] modeasDisponiveis) {
        this.modeasDoTroco.clear();

        if (valor <= 0) return;

        Arrays.sort(modeasDisponiveis);
        if (valor < modeasDisponiveis[0]) return;

        Change change = new Change(valor);

        for (int i = modeasDisponiveis.length - 1; i > -1; i--) {

            int check = change.isTheLimit();
            while (check != 1) {
                change.addTotalAdded(modeasDisponiveis[i]);

                check = change.isTheLimit();
                if (check == -1) {
                    change.removeTotalAdded(modeasDisponiveis[i]);
                    break;
                }

                this.modeasDoTroco.add(modeasDisponiveis[i]);
            }
        }

        printSolution();
    }

    public void printSolution() {
        System.out.print("[ ");
        int size = this.modeasDoTroco.size();
        for (int i = 0; i < size; i++) {
            System.out.print(this.modeasDoTroco.get(i));
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
        System.out.println();
    }


}
