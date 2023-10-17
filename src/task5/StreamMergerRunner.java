package task5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMergerRunner {
    public static void main(String[] args) {

        Stream<String> city =
                Stream.of("Odessa", "Kyiv", "Kharkiv", "Poltava", "Dnipro", "Chernigiv", "Vinnytsya", "Shostka");
        Stream<String> population =
                Stream.of("993120", "2884000", "1419000", "284492", "966400", "285821");

        Stream<String> cityWithPopulation = StreamMerger.zip(city, population);
        cityWithPopulation
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
