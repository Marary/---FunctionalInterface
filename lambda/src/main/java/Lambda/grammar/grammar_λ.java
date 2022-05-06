package Lambda.grammar;

/**
 * Here we show the basic syntax of lambda expressions and some ellipsis rules.
 * The method implementation is irrelevant.
 * Now we need to understand the syntax of lambda and its ellipsis rules.
 * 在此展示lambda表达式的基本语法和一些省略规则，其中的方法实现无关紧要，现在要体会lambda的语法和其省略规则。
 */
public class grammar_λ {

    /**
     * There is no omitted form.
     * 没有省略的形式。
     * @param num1
     * @param num2
     */
    public void fun_1(int num1,int num2){
        funInterface funInterface=(int s1,int s2)->{
            s1^=s2;
            s2^=s1;
            s1^=s2;
            return s1;
        };
        System.out.println(funInterface.fun(num1,num2));
    }

    /**
     * Variable types can be omitted and the compiler can deduce.
     * 可以省略变量类型，编译器可以推导。
     * @param num1
     * @param num2
     */
    public void fun_2(int num1,int num2){
        funInterface funInterface=(s1,s2)->{
            s1^=s2;
            s2^=s1;
            s1^=s2;
            return s1;
        };
        System.out.println(funInterface.fun(num1,num2));

    }

    /**
     * Only one parameter, omit ().
     * 只有一个参数，省略（）。
     * @param num
     */
    public void fun_3(int num){
        funInterface_copy funInterface= s->{
          s=(int)(s*Math.random());
          if(s>10)
              System.out.println(s);
        };
        funInterface.fun(num);
    }

    /**
     * If there is only one statement in the body here, {} can be omitted.
     * 此处主体只有一个语句，则可省略{}。
     * @param num
     */
    public void fun_4(int num){
        funInterface_copy funInterface=s-> System.out.println(s);
        funInterface.fun(num);
    }

    /**
     * If there is only a return statement here, {} can be omitted.
     * 此处只有return语句，则可省略{}.
     * @param num1
     * @param num2
     */
    public void fun_5(int num1,int num2){
        funInterface funInterface=(s1,s2)-> s1^=s2;
        System.out.println(funInterface.fun(num1,num2));
    }

}
