package stats;

public class Stats {
    double sum = 0.0 ,mean = 0.0, max = 0.0, min = 0.0, count = 0.0;

    public Stats(Object[] list) {
        for (Object item : list) {
            // count
            count++;
            // min
            min = ((double) item) < min ? (double) item : min;
            // max
            max = ((double) item) > min ? (double) item : max;
            // sum
            sum += (double) item;
        }
    }
}
