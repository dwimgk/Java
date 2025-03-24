public class NumberParser {
    private int finalNumber;

    public int parse(String input) {
        String lang = TextSplitterUtil.languageDetect(input);
        String[] words = TextSplitterUtil.split(input);

        NumberConverterUtil numberConverter = null;
        int result=0;

        if(lang.equals("Cyrillic")){
            numberConverter= new NumberConverterUtilBg();
        }
        else if(lang.equals("English")){
            numberConverter=new NumberConverterUtilEn();
        }
        if(numberConverter!=null){
            result = numberConverter.convert(words);
        }
        else {
            System.out.println("Number is not in a known language");
        }

        return result;
    }
}
