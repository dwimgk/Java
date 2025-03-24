public class NumberConverterUtilEn implements NumberConverterUtil {
    @Override
    public int convert(String[] words) {
        int finalNumber = 0;
        int tempNumber = 0;

        for (int i = 0; i < words.length; i++) {
            if(!words[i].equals("hundred") && !words[i].equals("thousand")) {
                if(!words[i].equals("and")) {
                    tempNumber = addNamedNums(words, i, tempNumber);
                }
            }
            else if(words[i].equals("hundred")) {
                tempNumber *=100;
            }
            else if(words[i].equals("thousand")) {
                tempNumber *= 1000;
                finalNumber += tempNumber;
                tempNumber = 0;
            }
            else if(words[i].equals("and")) {
//                finalNumber += tempNumber;
//                tempNumber = 0;
            }
            else {
                System.out.println("Error: invalid separator");
            }
        }
        finalNumber += tempNumber;
        return finalNumber;
    }

    private int addNamedNums(String[] words, int i, int tempNumber) {
        switch (words[i]) {
            case "one" -> tempNumber += 1;
            case "two" -> tempNumber += 2;
            case "three" -> tempNumber += 3;
            case "four" -> tempNumber += 4;
            case "five" -> tempNumber += 5;
            case "six" -> tempNumber += 6;
            case "seven" -> tempNumber += 7;
            case "eight" -> tempNumber += 8;
            case "nine" -> tempNumber += 9;
            case "ten" -> tempNumber += 10;
            case "eleven" -> tempNumber += 11;
            case "twelve" -> tempNumber += 12;
            case "thirteen" -> tempNumber += 13;
            case "fourteen" -> tempNumber += 14;
            case "fifteen" -> tempNumber += 15;
            case "sixteen" -> tempNumber += 16;
            case "seventeen" -> tempNumber += 17;
            case "eighteen" -> tempNumber += 18;
            case "nineteen" -> tempNumber += 19;
            case "twenty" -> tempNumber += 20;
            case "thirty" -> tempNumber += 30;
            case "forty" -> tempNumber += 40;
            case "fifty" -> tempNumber += 50;
            case "sixty" -> tempNumber += 60;
            case "seventy" -> tempNumber += 70;
            case "eighty" -> tempNumber += 80;
            case "ninety" -> tempNumber += 90;

            case null, default -> System.out.println("Invalid number");
        }
        return tempNumber;
    }
}
