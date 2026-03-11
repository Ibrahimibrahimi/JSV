package stats;

public class Basic {
    public static double mean(Object[] list) {
        double result = 0.0;
        int count = 0;
        for (Object item : list) {
            count++;
            result += (double) item;
        }
        return result / count;
    }

    public static double max(Object[] list) {
        double max = 0.0;
        for (Object item : list) {
            max = (double) item > max ? (double) item : max;
        }
        return max;
    }

}
