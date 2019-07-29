package LeanJDK8;

import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *  jdk8 函数式接口
 */
public class Jdk8FunctionalInterface {

    public static void main(String[] args) {

        /**
         *  1、定义：
         *      函数式接口（FunctionalInterface）就是一个 有且只有一个抽象的方法，但是可以有多个非抽象方法的接口。
         *      函数式接口可以隐式转为lambda表达式
         *    Jdk8之前已有的函数式接口，常见的有：
         *       java.lang.Runnable
         *       java.util.Comparator
         *       java.io.FileFilter
         *
         *    Jdk8新增的函数式接口，在java.util.function 包下面
         *    此类接口，会有 @FunctionalInterface 注解标识
         */


        /**
         *  2、实例
         */
        // 给参数加上10
        DoubleFunction<Double> doubleFunction = n -> n + 10.0;
        System.out.println(doubleFunction.apply(10));

        // 判断传入的值是否大于10
        DoubleFunction<Boolean> doubleFunction1 = n -> n > 10;
        System.out.println(doubleFunction1.apply(8));

        // Predicate 的test方法，返回boolean类型
        Predicate<Integer> predicate = r -> r * 2 > r+10;
        System.out.println(predicate.test(8));


    }


}
