public class Exercise7 {
    public static void main(String[] args) {
        try {
            hasVowels("bcdrt");
        } catch (DoesNotContainVowelsException e) {
            System.out.println(e.getMessage());
        }
    }

    static void hasVowels (String message) throws DoesNotContainVowelsException {
        char[] chars = message.toCharArray();

        boolean hasVowel = false;
        for (char c : chars) {
            boolean res = isVowel(c);
            hasVowel |= res;
        }

        if (!hasVowel) {
            throw new DoesNotContainVowelsException("Does not contain vowels.");
        }
    }

    static boolean isVowel (char c) {
        final String VOWELS = "aeiouAEIOU";
        return VOWELS.indexOf(c) != -1;
    }
}

class DoesNotContainVowelsException extends Exception {
    public DoesNotContainVowelsException(String message) {
        super(message);
    }
}