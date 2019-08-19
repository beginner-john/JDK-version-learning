package LeanJDK9;

public class Features4 {

    /**
     *      7、限制使用单独下划线标识符
     *      在JDK8之前可以使用“_”单独的下划线作为标识符，但在JDK9中将单独的下划线标识符限制使用了，
     *      可能后期会将这个标识符做特殊处理如Lambda表达式一样的->操作符一样。
     *
     *
     *      8、String 存储结构变更（底层由char数组改为byte数组）
     *      从很多不同应用程序收集的信息表名，字符串是堆使用的主要组成部分，而且，大多数字符串对象只包含一个字符，这样的字符只需要一个字节的存储空间，因此这些字符串对象的内部char数组中有一半的空间被闲置。
     *      JDK9之前String底层使用char数组存储数据private final char value[]，JDK9将String底层存储数据改为byte数组存储数据private final byte[] value。
     *      StringBuffer和StringBuilder也同样做了变更，将以往char数组改为byte数组。
     *
     *
     */
}
