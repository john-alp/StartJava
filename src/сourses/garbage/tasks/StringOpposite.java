package сourses.garbage.tasks;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * 07.04.2021
 * Задача с собеса Зеленого банка, который я завалил  ))
 * Напишите программу на Java для переворачивания строки, изменив расположение символов в строке
 * задом наперёд без использования встроенных в String функций
 */

public class StringOpposite {
    final static String STRING = "abc";
    String result = "";

    // example char
    private String opposite(final String str) {
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }
        return result;
    }

    // example reverse
    private String oppositeStringBuilder(final String str) {
        StringBuilder sb = new StringBuilder();
        return sb.append(str).reverse().toString();
    }

    // split
    private String oppositeSplit(final String str) {
        String[] el = str.split("");
        for (int i = el.length - 1; i >= 0; i--) {
            result += el[i];
        }
        return result;
    }

    // getByte
    private String oppositeByte(final String str) {
        byte[] bytes = str.getBytes();
        for (int i = bytes.length - 1; i >= 0; i--) {
            result += new String(Character.toChars(bytes[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new StringOpposite().opposite(STRING));
        System.out.println(new StringOpposite().oppositeStringBuilder(STRING));
        System.out.println(new StringOpposite().oppositeSplit(STRING));
        System.out.println(new StringOpposite().oppositeByte(STRING));

    }


}
