package LeanJDK7;

import java.util.ArrayList;
import java.util.List;

/**
 * JDK7新增二进制表示，以及数字中加入分隔符
 * JDK7之前是支持十进制（123），八进制（0123），十六进制（0X12AB）。
 *  jdk7添加二进制表示（0B11100110，0b1011001）
 *  注：上面这个是‘0’是数字0
 */
public class NewFeaturesByNumber {

    public static void main(String[] args) {
        /**
         * 新增二进制表示
         */
        byte by = (byte)0B00011001;
        short sh = (short) 0B1001101;
        int in = 0B1001100;
        long along = 0B10001011L;
        //注意：数值默认是int类型的，因此转换类型
        // 后缀加L代表是long类型，加d是double类型，加f是float类型

        /**
         * 数字中加入分隔符
         */
        int money = 1_000_000;//编译器会在编译的时候，把数字中的下划线去掉
        int amont = 10_0_0_0;

        /**
         * 对泛型type引用进行改进
         * 泛型是JDK1.5加入的。
         */
        //原本
        List<String> strings = new ArrayList<String>();
        //现在
        List<String> stringList = new ArrayList<>();

    }

}

