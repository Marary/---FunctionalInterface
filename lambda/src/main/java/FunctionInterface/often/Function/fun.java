package FunctionInterface.often.Function;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The function interface has a parameter with return value. Both parameters and return value are generic.
 * The interface method is briefly introduced:
 * This interface is usually used to process parameters, convert them, and then return values
 * R apply (T): apply this function to the given parameter
 * Default < V > function and then (function after): return a combined function and apply values to the function in turn
 *
 * Function接口  有一个参数 有返回值,参数和返回值均为泛型。
 * 对于该接口方法发简单介绍:
 * 此接口通常用于对参数进行处理、转换，然后返回值
 * R apply(T t):将此函数应用于给定的参数
 * default<V> Function andThen(Function after):返回一个组合函数，依次将值应用于函数中
 */

public class fun {
    public static void getFun(String str,Integer integer) {
        String regStr="\\d{1,8}";
        Pattern pattern=Pattern.compile(regStr);
        Matcher matcher=pattern.matcher(str);
        StringBuilder temp=new StringBuilder();
        while (matcher.find())
            temp.append(matcher.group(0));
        if (temp.length()==0)
            temp.append("0");
//        c-1
        convert(temp.toString(),Integer::parseInt);
//        c-2
        convert(integer,s->String.valueOf(s+566));
//        c-3
        convert(temp.toString(),Integer::parseInt,s->String.valueOf(s+566));

    }
//     c-1
    private static void convert(String str, Function<String,Integer> fun){
        System.out.println(fun.apply(str));
    }
//     c-2
    private static void convert(int i,Function<Integer,String> fun){
        System.out.println(fun.apply(i));
    }
//     c-3
    private static void convert(String str,Function<String,Integer> f1,Function<Integer,String> f2){
        System.out.println(f1.andThen(f2).apply(str));
    }
}
