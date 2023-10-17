package task3;

public class ArrayParserRunner {
    public static void main(String[] args) {
        ArrayParser parser = new ArrayParser();
        Array array = new Array();
        System.out.println("array = " + array);
        System.out.println(parser.parseArray(array.getArray()));
    }
}
