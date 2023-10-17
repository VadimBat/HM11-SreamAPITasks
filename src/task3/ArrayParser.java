package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ArrayParser {
    public String parseArray(String[] data){
        int i = 0;
        StringJoiner dataNumbers = new StringJoiner(", ");

        while(i< data.length){
            dataNumbers.add(data[i]);
            i++;
        }
        String[] numbers = dataNumbers.toString().split(",\\s+");

        List<String> list = new ArrayList<>();
        for (int j = 0; j < numbers.length; j++) {
            list.add(numbers[j]);
        }

        List<String> sortedNumbers = list
                .stream()
                .sorted()
                .collect(Collectors.toList());

        StringJoiner result = new StringJoiner(", ");
        for (String number : sortedNumbers) {
            result.add(number);
        }
        return result.toString();
    }
}
