package FunctionInterface.often.Consumer;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class test {
    @Test
    public void test(){
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",19);
        map.put("李四",20);
        map.put("王五",18);
        DataConsumer.DataOperator(map);
    }
}
