package FunctionInterface.often.Consumer;

import java.util.Map;
import java.util.function.Consumer;

/**
 * The consumer interface has a parameter with no return value.
 * The parameter type is generic, which can be selected by yourself.
 * Brief introduction to the method of this interface:
 * This interface is a consumption interface, and the data consumed is determined by generics
 * Void accept (T): performs an operation on a given parameter
 * Default consumer < T > and then (consumer after): returns a combined operation and executes the operation in turn
 *
 * Consumer接口 有一个参数 无返回值,参数类型为泛型,根据自己选择。
 * 对于该接口的方法的简单介绍:
 * 该接口为消费型接口,其消费的数据由泛型决定
 * void accept(T t):对给定的参数执行操作
 * default Consumer<T> andThen(Consumer after):返回一个组合的操作，依次执行操作
 */
public class DataConsumer {

    public static void DataOperator(Map<String,Integer> map){
        if (map.keySet()!=null){
            for(String key: map.keySet())
                operator(key,map.get(key),c1-> System.out.println("姓名:"+ c1),c2-> System.out.println("年龄:"+c2));
        }
    }


    private static void operator(String name, Integer age, Consumer<String> c1,Consumer<Integer> c2){
        c1.accept(name);
        c2.accept(age);
    }
}
