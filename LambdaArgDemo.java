interface StringFunc {
    String func(String str);
}

public class LambdaArgDemo {

    // This method has a func interface as type of its first param
    // So it can be passed a ref to any instance of that interface,
    // including an instanc created by a lambda ex. The second param specifies
    // the string to operate on

    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "Lambda Expressions Expand Java";
        String outStr;

        System.out.println("Here is input string: " + inStr);

        // expression that reverses the contents of a String
        // and assigns it to a StringFunc ref var
        StringFunc reverse = (s) -> {

            String result = "";
            for (int i = s.length() - 1; i >= 0; i--)
                result += s.charAt(i);

            return result;
        };

        outStr = changeStr(reverse, inStr);
        System.out.println("The string reversed: " + outStr);

        // expression that replaces spaces with hyphens.
        // is embedded directly in call to changeStr().
        outStr = changeStr((s) -> s.replace(' ', '-'), inStr);
        System.out.println("The string with spaces replaced: " + outStr);

        // this lambda block inverts the case of chars in string.
        // Also embedded in call to changeStr()
        outStr = changeStr((s) -> {

            String result = "";
            char ch;

            for (int i = 0; i < s.length(); i++) {

                ch = s.charAt(i);
                if (Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }
            return result;
        }, inStr);

        System.out.println("The string in reversed case: " + outStr);
    }
}
