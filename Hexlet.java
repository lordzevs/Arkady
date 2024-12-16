

public class Hexlet {
    public static String encrypt(String str) {
        // BEGIN (write your solution here)
        var result = "";
    for (var i = 0; i < str.length(); i +=2 ) {
        if (i + 1 < str.length()) {
            result += str.charAt(i+1);
            result += str.charAt(i);
        } 
        else if (str.length()%2 == 1) {
            result +=str.charAt(str.length() - 1);

        }
    }
    return result;
}    
        public static void main(String[] args) {
        System.out.println(Hexlet.encrypt("HeHuр"));
    }
        // END
}