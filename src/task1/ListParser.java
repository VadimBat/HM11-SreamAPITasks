package task1;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ListParser {

    public String parseList(List<String> list){
        List<String> oddElements = IntStream
                .range(0, list.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i+"."+list.get(i))
                .collect(Collectors.toList());

        StringJoiner result = new StringJoiner(", ");
        for (String oddElement : oddElements) {
            result.add(oddElement);
        }
        return result.toString();
    }
}
