package stats;

public class Basic {

    public static double sum(Object[] list) {
        double sum = 0.0;
        for (Object item : list) {
            sum += (double) item;
        }
        return sum;
    }

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
            max = ((double) item) > max ? (double) item : max;
        }
        return max;
    }

    public static double min(Object[] list) {
        double min = 0.0;
        for (Object item : list) {
            min = ((double) item) < min ? (double) item : min;
        }
        return min;
    }

    public static double count(Object[] list) {
        int count = 0;
        for (Object item : list) {
            count++;
        }
        return count;
    }
}
