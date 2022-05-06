package FunctionInterface.often.Supplier;

import java.util.function.Supplier;

/**
 * The supplier interface has a return value and no parameters.
 * The return value type is generic and needs to be selected according to your needs.
 * Brief introduction to the method of this interface:
 * This interface is a production interface.
 * After specifying the data, the generic type returns the value to us according to the logic we wrote.
 * Parameterless method t get(): get results
 *
 * Supplier接口 有返回值 无参数,返回值类型为泛型需要你根据需要自己选择。
 * 对于该接口的方法的简单介绍:
 * 该接口是生产型接口，泛型指定数据后，根据我们所写的逻辑返回值给我们使用。
 * 无参方法 T get():获得结果
 */
public class Max {

    public static void getMax(Double[] doubles){
        if (doubles.length>0){
            Double Max=supplier(()->{
                Double max=doubles[0];
                for(Double d:doubles){
                    if (d>max)
                        max=d;
                }
                return max;
            });
            System.out.println("数组的最大值为"+Max);
        }
    }

    private static Double supplier(Supplier<Double> s){
        return s.get();
    }
}
