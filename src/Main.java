import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        WordFilter wordFilter = new WordFilter();
        String userContents = wordFilter.userContent;
        String[] blackWordList = wordFilter.blackWordList;

        Map<String, Integer> report = wordFilter.countBlackWords(userContents, blackWordList);

        for (Map.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "개 발견");
        }
    }
}