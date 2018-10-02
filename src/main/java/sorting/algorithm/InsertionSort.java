package sorting.algorithm;

public class InsertionSort{
    private long numberOfLoops = 0;

    public void sort(int[] randomArray) {
        for (int i = 0; i < randomArray.length - 1; i++) {
            this.numberOfLoops++;
            if (randomArray[i] > randomArray[i + 1]) {
                swap(randomArray, i, i + 1);
                for (int j = i; j > 0; j--) {
                    this.numberOfLoops++;
                    if (randomArray[j] < randomArray[j - 1]) {
                        swap(randomArray, j, j - 1);
                    }
                }
            }
        }
    }

    private static void swap(int[] randomArray, int j, int k) {
        int aux;
        aux = randomArray[j];
        randomArray[j] = randomArray[k];
        randomArray[k] = aux;
    }

    public long getNumberOfLoops() {
        return numberOfLoops;
    }
}

