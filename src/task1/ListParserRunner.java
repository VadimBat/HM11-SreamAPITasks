package task1;

public class ListParserRunner {
    public static void main(String[] args) {

        ListParser parser = new ListParser();
        String result = parser.parseList(NamesList.names());
        System.out.println("result = " + result);
    }
}
