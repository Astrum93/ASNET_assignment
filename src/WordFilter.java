import java.util.*;
import java.lang.*;

public class WordFilter {
    /**
     * 금지어 확인 함수.
     *
     * @param userContent 사용자의 글
     * @param blackWordList 금지어 목록
     * @return 금지어의 등장 횟수와 목록
     */

    String userContent = "오늘은 너무 힘든 하루 였다. 나무 숲, 바다, 파도, 나무 나무 나무 나 무 숲 숲 숲 숲";
    String[] blackWordList = {"나무","숲"};
    Map<String, Integer> result = new HashMap<>();


    public Map<String, Integer> countBlackWords(String userContent, String[] blackWordList) {
        String[] userContentSplit = userContent.split(" ");
        for (String blackword : blackWordList){
            // System.out.println(blackword);
            int wordCount = 0;
            if (userContent.contains(blackword)) {
                for (String splitContent : userContentSplit) {
                    if (blackword.equals(splitContent)) {
                        //System.out.println(blackword + " 발견.");
                        wordCount++;
                        result.put(blackword, wordCount);
                    }
                    // else System.out.println("발견 되지 않았습니다.");
                }
            }
           // else {
               // System.out.println("없습니다.");
           // }
        }
        return result;
    }
}


