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

    String usercontent = "오늘은 너무 힘든 하루 였다. 나무 숲, 바다, 파도, 나무나무나무 나 무";
    String[] blackWordList = {"나무","숲"};
    Map<String, Integer> result;

    public Map<String, Integer> countBlackWords(String usercontent, String[] blackWordList) {
        for (int i = 0;  i < blackWordList.length; i++){
            System.out.println(blackWordList[i]);
            if (usercontent.contains(blackWordList[i])){
                System.out.println("있습니다.");
                result.put("blackWordList[i]", 0);
                System.out.println(result);
            }
            else {
                System.out.println("없습니다.");
            }
        }
        return result;
    }
}


