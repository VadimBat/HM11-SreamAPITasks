package task2;

public class ListParserRunner {
    public static void main(String[] args) {

        ListParser parser = new ListParser();
        System.out.println(parser.parseList(NamesList.names()));
    }
}
