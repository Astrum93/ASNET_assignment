import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        WordFilter wordFilter = new WordFilter();
        String userContents = wordFilter.usercontent;
        String[] blackWordList = wordFilter.blackWordList;
        System.out.println(wordFilter.result.toString());
    }
}