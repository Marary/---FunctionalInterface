package FunctionInterface.result;

public class Result {
    /**
     * 以下将函数式接口作为返回值的方法通过匿名内部类和Lambda表达式两种形式演示.
     * 函数式接口作为返回值的实际应用也可以举Runnable接口的例子.
     * @return
     */
    public feedback getResult_1(){
        return new feedback() {
            @Override
            public void save() {
                System.out.println("保存成功");
            }
        };
    }

    public feedback getResult_2(){
        return ()-> System.out.println("****save****");
    }
}
