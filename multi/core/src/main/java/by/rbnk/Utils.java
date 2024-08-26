package by.rbnk;

public class Utils {

    public boolean isAllPositiveNumbers(String... str) {
        if (str == null || str.length == 0) {
            return false;
        }
        StringUtils stringUtils = new StringUtils();
        for (int i = 0; i < str.length; i++) {
            if (!stringUtils.isPositiveNumber(str[i])) {
                return false;
            }
        }
        return true;
    }
}
