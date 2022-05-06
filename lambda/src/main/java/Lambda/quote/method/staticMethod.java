package Lambda.quote.method;

import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class staticMethod {
    /**
     * Match a string starting with H / h with a length greater than or equal to 2 and less than 12.
     * If it matches, it returns true, otherwise it returns false.
     * 匹配一个以h/H开头的长度大于等于2小于12的字符串，如果匹配到了返回true，否则返回false。
     * @param str
     * @return sign
     */
    public static boolean startWithH(String str){
        boolean sign=false;
        String regStr="^[hH][a-zA-Z]{1,10}";
        Pattern pattern=Pattern.compile(regStr);
        Matcher matcher=pattern.matcher(str);
        while (matcher.find()){
            sign=true;
        }
        return sign;
    }
}
