import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        WordFilter wordFilter = new WordFilter();
        WordFilter2 wordFilter2 = new WordFilter2();

        UserContents userContents = new UserContents();
        BlackWordList blackWordList = new BlackWordList();

        // 첫 번째 WordFilter
        Map<String, Integer> report = wordFilter.countBlackWords(userContents.Contents, blackWordList.wordList);
        // 두 번째 WordFilter(정규식)
        Map<String, Integer> report2 = wordFilter2.countBlackWords2(userContents.Contents2, blackWordList.wordList);

        // 첫 번째 WordFilter 실행
        System.out.println("첫 번째 WordFilter 시작");
        for (Map.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "개 발견");
        }
        System.out.println("첫 번째 WordFilter 종료");
        System.out.println(" ");

        // 두 번째 WordFilter(정규식) 실행
        System.out.println("두 번째 WordFilter 시작");
        for (Map.Entry<String, Integer> entry : report2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "개 발견");
        }
        System.out.println("두 번째 WordFilter 종료");
    }
}