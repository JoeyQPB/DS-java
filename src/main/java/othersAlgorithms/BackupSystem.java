package othersAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackupSystem {

    public interface Batch {
        int[] getFileSizes();
        int getTapeSize();
    }

    public static class NewBatch implements Batch {
        private int[] fileSizes;

        public NewBatch(int[] fileSizes) {
            this.fileSizes = fileSizes;
        }


        @Override
        public int[] getFileSizes() {
            return this.fileSizes;
        }

        @Override
        public int getTapeSize() {
            return 100;
        }
    }

    public static class Tape {
        private int stored;
        private int numberOfFiles;

        public Tape (int stored) {
            this.numberOfFiles = 1;
            this.stored = stored;
        }

        public int getStored() {
            return stored;
        }

        public void addStored(int stored) {
            this.stored += stored;
        }

        public int getNumberOfFiles() {
            return numberOfFiles;
        }

        public void addFiles() {
            if (this.numberOfFiles == 2) return;
            this.numberOfFiles++;
        }
    }

    public int getMinimumTapeCount(final Batch batch) {
        int[] sizes = batch.getFileSizes();
        Arrays.sort(sizes);

        int tapes = 0;
        List<Tape> tapeList = new ArrayList<>();

        for (int i = sizes.length - 1; i > -1; i--) {
            boolean stored = false;

            for (Tape tape : tapeList) {
                if(tape.getStored() + sizes[i] <= batch.getTapeSize() && (tape.getNumberOfFiles() < 2)) {
                    tape.addStored(sizes[i]);
                    tape.addFiles();
                    stored = true;
                }
            }

            if (!stored) {
                tapes++;
                tapeList.add(new Tape(sizes[i]));
            }
        }

        return tapes;
    };
}
