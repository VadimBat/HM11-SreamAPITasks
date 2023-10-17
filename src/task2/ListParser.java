package task2;

import java.util.List;
import java.util.stream.Collectors;

public class ListParser {

    public List<String> parseList(List<String> list){
        List<String> parsed = list
                .stream()
                .map(s -> s.toUpperCase())
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
        return parsed;
    }
}
