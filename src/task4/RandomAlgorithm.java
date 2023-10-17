package task4;

public class RandomAlgorithm {
    private final long a;
    private long last = 23311;

    public RandomAlgorithm(long a) {
        this.a = a;
    }

    public long next(long c, long m){
        last=(a*last+c)%m;
        return last;
    }
}
