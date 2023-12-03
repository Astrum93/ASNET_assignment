import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        WordFilter wordFilter = new WordFilter();
        WordFilter2 wordFilter2 = new WordFilter2();

        UserContents userContents = new UserContents();
        BlackWordList blackWordList = new BlackWordList();



        Map<String, Integer> report = wordFilter.countBlackWords(userContents.Contents, blackWordList.wordList);
        Map<String, Integer> report2 = wordFilter2.countBlackWords2(userContents.Contents2, blackWordList.wordList);

        for (Map.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "개 발견");
        }

        for (Map.Entry<String, Integer> entry : report2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "개 발견");
        }
    }
}