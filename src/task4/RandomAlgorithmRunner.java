package task4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomAlgorithmRunner {
    public static void main(String[] args) {

        RandomAlgorithm random = new RandomAlgorithm(25214903917L);

        Stream<Long> stream = Stream.iterate(0L,(seed) -> random.next(11L,(long)Math.pow(2.0,48.0)));
        stream
                .limit(25)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
