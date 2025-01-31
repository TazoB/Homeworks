public class Methods {
    // 1.
    public int numbersInString(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            if("0123456789".indexOf(str.charAt(i)) != -1) {
                sum++;
            }
        }
        return sum;
    }

    // 2.
    public int sentencesInString(String str) {
        int sum = 0;
        for(int i = 1; i < str.length(); i++) {
            if(".?;!".indexOf(str.charAt(i)) != -1) {
                sum++;
            }
        }
        return sum;
    }

    // 3.
    public boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        return sb.toString().equals(str);
    }

    // 4.
    public boolean oneStringEqualsOther(String s1, String s2) {
        return s1.contains(s2);
    }

    // 5.
    public void endsWithVowelOrConsonant(String str) {
        char lastLetter = str.charAt(str.length()-1);
        if(lastLetter == 'a' || lastLetter == 'e' || lastLetter == 'i' || lastLetter == 'o' || lastLetter == 'u') {
            System.out.println("მთავრდება ხმოვანზე.");
        } else {
            System.out.println("მთავრდება თანხმოვანზე.");
        }
    }

    // 6.
    public String originalWord(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < str.length()/2; i++) {
            sb.deleteCharAt(i+1);
        }


        return sb.toString();
    }

    public String convertingHugeWords(String str) {
        if(str.length() <= 10) {
            System.out.println("რიცხვი არ არის უზარმაზარი.");
            return str;
        }
        System.out.println("რიცხვი უზარმაზარია.");
        String result = String.valueOf(str.charAt(0));
        result += str.length()-2;
        result += String.valueOf(str.charAt(str.length()-1));
        return result;
    }
}