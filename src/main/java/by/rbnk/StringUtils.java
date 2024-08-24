package by.rbnk;

public class StringUtils {

    boolean isPositiveNumber(String str) {
        if (str == null) {
            return false;
        }
        str = str.replace(",", ".");
        try {
            return Double.parseDouble(str) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
