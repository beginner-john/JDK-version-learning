package LeanJDK8;

/**
 *  JDK8  Lambda表达式
 *
 */
public class Jdk8Lambda {

    public static void main(String[] args) {
        /**
         *  1、语法
         *  (parameters) -> expresion 或 (parameters) ->{statements;}
         *  重要特性：
         *      可选类型声明：不需要声明参数类型，编译器可以统一识别参数值
         *      可选的参数圆括号：一个参数无需定义圆括号，但多个参数则需要定义圆括号
         *      可选的大括号：如果只有一个语句，则不需要大括号
         *      可选的返回关键字：如果主题只有一个表达式返回值，编译器会自动返回值，大括号需要指定表达式返回一个数值
         *
         */

        /**
         *  2、Lambda表达式实例
         */
        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;
        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;
        // 大括号中有返回语句
        MathOperation multiplication = (a, b) -> { return a*b;};
        // 没有返回语句和大括号
        MathOperation division = (a ,b) -> a / b;
        Jdk8Lambda tester = new Jdk8Lambda();

        System.out.println(tester.operate(5,3,addition));
        System.out.println(tester.operate(5,3,subtraction));
        System.out.println(tester.operate(5,3,multiplication));
        System.out.println(tester.operate(5,3,division));

        /**
         *  3. 变量作用域
         *      lambda表达式只能引用了标记为final的外层局部变量，也就是说不能在lambda内部修改定义在域外的局部变量，否则会编译错误。
         *      有种特殊情况是，lambda内部可以引用外层的非final局部变量，但是后面不能对该变量进行修改 ( 隐形final)
         */
        final int num = 6;
        MathOperation addition2 = (int a, int b) -> a + b + num;
        int c = 10;
        MathOperation addition3 = (int a, int b) -> a + b + c;
//        c = 20; //注释就不报错了

    }

    interface MathOperation {
        int operation(int a, int b);
    }
    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }


}
