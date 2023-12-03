import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;


public class WordFilter2 {
    /**
     * 금지어 확인 함수.
     *
     * @param userContent 사용자의 글
     * @param blackWordList 금지어 목록
     * @return 금지어의 등장 횟수와 목록
     */

    Map<String, Integer> result2 = new HashMap<>();


    public Map<String, Integer> countBlackWords2(String userContent, String[] blackWordList) {
        String[] userContentSplit = userContent.split(" ");
        for (String blackWord : blackWordList) {
            System.out.println(blackWord);
            int wordCount = 0;
            for (String splitContent : userContentSplit) {
                Pattern pattern = Pattern.compile(blackWord, Pattern.CASE_INSENSITIVE); // 영어일 경우 Pattern.CASE_INSENSITIVE
                Matcher matcher = pattern.matcher(splitContent);
                System.out.println(matcher);

                while (matcher.find()) {
                    wordCount++;
                    result2.put(blackWord, wordCount);
                }
            }
        }
        return result2;
    }
}