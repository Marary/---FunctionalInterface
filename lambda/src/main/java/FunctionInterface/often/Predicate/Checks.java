package FunctionInterface.often.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

import static java.lang.System.out;


/**
 * The Predicate interface has a parameter with a return value.
 * The parameter is generic and the return value is Boolean.
 * Brief introduction to the method of this interface:
 * This interface is often used to judge whether the parameters meet the given conditions
 * Boolean test (T): judge the given parameters, and its logic is implemented by the user (generally implemented by lambda expression)
 * Default predicate < T > negative(): returns the negation of a given judgment logic
 * Default predict < T > and (predict other): returns the combination judgment. For short circuit and
 * Default predict < T > or (predict other): return to combination judgment, corresponding to short circuit or
 *
 * Predicate接口 有一个参数 有返回值,参数为泛型,返回值为boolean类型。
 * 对于该接口的方法的简单介绍:
 * 该接口常用于判断参数是否满足给定条件
 * boolean test(T t):对给定的参数进行判断，其逻辑由使用者实现(一般使用Lambda表达式实现)
 * default Predicate<T> negate():返回给定判断逻辑的否定
 * default Predicate<T> and(Predicate other):返回组合判断，对于短路与
 * default Predicate<T> or(Predicate other):返回组合判断，对应短路或
 */
public class Checks {

//    比较两个字符串是否相同
    public static void Compare(String str1,String str2){
        boolean sign=checkString(str1,s -> s.equals(str2));
        if (sign)
            out.println(str1+"和"+str2+"是相同的");
        else
            out.println(str1+"和"+str2+"是不同的");
    }

//     对于单个参数操作一次
    private static boolean checkString(String str, Predicate<String> p){
        return p.test(str);
    }

//    检查字符串是否在指定长度--此处规定 [4,8]
    public static void CheckLength(String str){
//        由于我们在定义checkString时返回值调用了negate()方法,所以其返回值会颠倒,即false变为true,true变为false
        boolean sign=checkString(str,s1 -> s1.length()<4,s2 -> s2.length()>8);
        if (sign)
            out.println(str+"的长度在[4,8]内");
        else
            out.println(str+"的长度不在[4,8]内");
    }

//    对单个参数操作两次...多次请自己实现
    private static boolean checkString(String str,Predicate<String> p1,Predicate<String> p2){
        return p1.negate().and(p2).negate().test(str);
    }

//    输出名字长度大于2,而年龄大于30的人的名字和年龄
    public static void getData(String[] strings){
        ArrayList<String> list=checkString(strings,s1 -> s1.split(",")[0].length()>2,s2->Integer.parseInt(s2.split(",")[1])>30);
        list.forEach(out::println);
    }

//    对一个参数数组操作两次
    private static ArrayList<String> checkString(String[] strs, Predicate<String> p1, Predicate<String> p2){
        ArrayList<String> list=new ArrayList<>();
        for (String str:strs){
            if(p1.and(p2).test(str))
                list.add(str);
        }
        return list;
    }

}
