package task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMerger {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> resultList = new ArrayList<>();

        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();

        while(iteratorFirst.hasNext() && iteratorSecond.hasNext()){
            resultList.add(iteratorFirst.next());
            resultList.add(iteratorSecond.next());
        }
        return resultList.stream();
    }
}
