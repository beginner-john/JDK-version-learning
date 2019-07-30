package LeanJDK8;

import java.util.Optional;

/**
 *  Jdk8 Optional类
 *  Optional是java8中增加的API，可以很好的解决空指针异常，而不用我们来进行显式的空值检测。
 *
 */
public class Jdk8Optional {

    public static void main(String[] args) {
        Integer value1 = null;
        Integer value2 = new Integer(10);

        // ofNullable 允许传null
        Optional<Integer>  a = Optional.ofNullable(value1);

        //Optional.of 传nul会抛出异常 NullPointerException
        Optional<Integer> b = Optional.of(value2);

        //Optional.isPresent  判断值是否存在
        System.out.println(a.isPresent());

        // Optional.orElse 如果存在返回值，没有则返回默认值
        System.out.println(a.orElse(new Integer(0)));

        // Optional.orElseGet 如果值为空时，执行传入的函数，并返回
        // orElse 和 orElseGet 两个方法的作用很相似，但也有几个区别
        // 1、传入的参数不同
        // 2、使用时的区别，orElse在Optional为非空时，也会计算传入的值；
        //    而 orElseGet 只有在Optional为空时才执行传入的函数
        //  3、性能上的区别，由于第二点，一般orElseGet的性能会更好一点
        System.out.println(b.orElseGet(() -> 8));

        // Optional.get  获取值，需要值存在
        System.out.println(b.get());

        // Optional.orElseThrow 没有值的时候抛出指定异常
        b.orElseThrow(NullPointerException::new);

        /*
            以前对象非空判断是这样写的：
         */
        User user = null;
        if (user != null){
            System.out.println(user.getName());
        }else {
            user = new User();
        }

        /*
            现在可以这样写：
         */
        Optional<User> name = Optional.of(new User());
        Optional<User> empty = Optional.ofNullable(null);

        System.out.println(name.orElse(new User()));
        System.out.println(empty.orElse(new User()));
        System.out.println(empty.orElseGet(() -> new User()));

    }

}

class User{
    private String name;
    private int age;
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
