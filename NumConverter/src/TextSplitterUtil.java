import java.util.regex.Pattern;

public class TextSplitterUtil {
    /**
     * Detects the language and returns "Cyrillic" or "English".
     * @param input the input stream of the program
     * @return String
     */
    public static String languageDetect(String input){
        String language = "";
        if(Pattern.matches(".*[\\u0400-\\u04FF].*", input)){
            language= "Cyrillic";
        }
        else if(Pattern.matches(".*[a-zA-Z].*", input)){
            language= "English";
        }
        return language;
    }
    public static String[] split(String input) {
        String[] words = input.split(" ");
        return words;
    }
}
