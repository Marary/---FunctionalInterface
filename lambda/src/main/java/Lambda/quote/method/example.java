package Lambda.quote.method;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * For instance method reference, first we need to define a class and write a method at will.
 * Here I write a function that matches the first 13 digits of the string and outputs the results according to different situations.
 * This test case needs to use the consumer interface (one of the four common functional interfaces).
 * 实例方法的引用，首先我们需要定义一个类并且随意写一个方法,我在此处写了一个匹配字符串的前十三位数字，并根据不同情况输出结果的函数。
 * 该测试用例需要使用到Consumer接口(四个常用函数式接口之一)。
 */
public class example {
    /**
     * We need such a written method to provide lambda expression to instantiate and call.
     * Now you can do whatever you want for the implementation of the method.
     * 我们需要这样一个已经写好的方法，供给lambda表达式去实例化调用，现在对于方法的实现你可以随心所欲。
     * @param str
     */
    public void print(String str){
        String regStr="\\d{1,13}";
        StringBuilder temp=new StringBuilder();
        Pattern pattern=Pattern.compile(regStr);
        Matcher matcher=pattern.matcher(str);
        while (matcher.find()){
            temp.append(matcher.group(0));
        }

        Long number= Long.valueOf(temp.toString());
        if(number>5000)
            System.out.println(number);
        else
            System.out.println(-1);
    }
}
