package LeanJDK9;

import java.util.*;

public class Features5 {


    /**
     *      9、快速创建只读集合
     *         JDK9在List、Set和Map集合中新增of静态方法，快速创建只读集合。
     *         List<String> list = List.of("A", "B", "C");
     *         System.out.println(list);
     *
     *      10、增强 Stream API
     *      JDK9在Stream接口中新增4个方法：dropWhile、takeWhile、ofNullable,为iterate方法新增重载方法。
     *
     *      11、改进 Optional 类
     *      Optional 类是在JDK8中新增的类，主要是为了解决空指针异常。在JDK9中对这个类进行了改进，
     *      主要是新增了三个方法：stream，ifPresentOrElse 和 or 。
     *
     *
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list = Collections.unmodifiableList(list);
        System.out.println(list);
        Set<String> set = new HashSet<>();
        set.add("E");
        set.add("F");
        set.add("G");
        //设为只读Set集合
        set = Collections.unmodifiableSet(set);
        System.out.println(set);
        list.add("2");


    }
}
