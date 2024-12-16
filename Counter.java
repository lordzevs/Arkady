

public class Counter {
    public static int bigLettersCount(String text) {
        var result = 0;

        for (var i = 0; i < text.length(); i++) {
            var current = text.charAt(i);
            if (Character.toUpperCase(current) == current) {
                result += 1;
            }
        }

        return result;
    }
}
