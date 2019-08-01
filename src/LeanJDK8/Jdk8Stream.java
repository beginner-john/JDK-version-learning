package LeanJDK8;

import java.util.*;
import java.util.stream.Collectors;

/**
 *  Jdk8 Stream
 *   Stream API 可以极大提高Java程序员的生产力，让程序员写出高效、干净、简洁的代码
 */
public class Jdk8Stream {

    public static void main(String[] args) {

        /**
         *  1、定义
         *      元素：是特定类型的对象，形成一个队列。Java中的Stream不会存储元素，而是按需计算
         *      数据源：流的来源，可以是集合，数组，IO channel，产生器generator等
         *      聚合操作：类似于sql语句一样的操作，比如filter，map，reduce，find，match，sorted等
         *      和以前的Collection操作不同，Stream还有两个基础的特征：
         *       Pipelining::  中间操作都会返回流本身，如同流式风格。
         *       内部迭代：以前的对集合遍历和for-each的方式，显示的在集合外部进行迭代，Stream的内部迭代的方式，
         *       是通过访问者模式Visitor实现。
         */


        /**
         *   2、stream() 方法
         *      创建流
         *
         *   3、forEach()
         *      遍历
         */
        List<String> list = Arrays.asList("tom","jack","john");
        list.stream().forEach(e -> System.out.println(e));


        /**
         *  4、map()
         *      用于映射到每个元素到对应的结果
         */
        List<Integer> numbers = Arrays.asList(3,2,4,6,5);
        List<Integer> squaresList = numbers.stream().map(n -> n * n).distinct().collect(Collectors.toList());
        System.out.println(squaresList);


        /**
         *  5、filter（）
         *      设置条件过滤出元素
         */
        List<String> strings = Arrays.asList("name","","age","","hello");
        int count = (int)strings.stream().filter(e -> e.isEmpty()).count();
        System.out.println(count);

        /**
         *  6、limit()
         *      获取指定数量的流
         */
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        /**
         *  7、sorted()
         *      对流进行排序
         */
        System.out.println(strings.stream().sorted());
        System.out.println(strings.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //这里写排序规则
                return 0;
            }
        }));


        /**
         *  8、并行程序
         *      parallelStream是流并行处理程序的替代方法。
         */
        List<String> stringPara = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        int count2 = (int)stringPara.parallelStream().filter(e -> e.isEmpty()).count();

        /**
         *  9、Collectors
         *     该类实现了很多规约操作，例如将流转换为集合和聚合元素。Collectors可用于返回列表和字符串
         */
        List<String> strings3 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings3.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选列表: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);


        /**
         *  10、统计
         *      主要用于int，double，long等基本类型中
         */
        List<Integer> numberList = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics intSummary = numberList.stream().mapToInt(e -> e).summaryStatistics();
        System.out.println(intSummary.getMax());
        System.out.println(intSummary.getSum());

    }
}
