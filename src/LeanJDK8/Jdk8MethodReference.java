package LeanJDK8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 *  JDK8 方法引用
 *
 */
public class Jdk8MethodReference {

    public static void main(String[] args) {

        /**
         *  1、定义
         *      方法引用通过方法的名字来指向一个方法
         *      方法引用可以使语言的构造更紧凑，减少冗余代码
         *      方法引用使用一对冒号 ::
         *
         */


        /**
         *  2、实例
         */
        List<String> names = new ArrayList<>();
        names.add("tom");
        names.add("king");
        names.add("jack");
        names.forEach(System.out::println); // 方法引用
        names.forEach(x -> System.out.println(x));// lambda

        // 构造器引用 语法是 Class::new
        Jdk8MethodReference methodReference1 = Jdk8MethodReference.create(Jdk8MethodReference::new);
        Jdk8MethodReference methodReference2 = Jdk8MethodReference.create(Jdk8MethodReference::new);
        List<Jdk8MethodReference> referenceList = Arrays.asList(methodReference1,methodReference2);
        // 静态方法引用， 语法是 Class::static_method
        referenceList.forEach(Jdk8MethodReference::collide);
        // 任意对象的方法引用
        referenceList.forEach(Jdk8MethodReference::repair);
        // 特定对象的方法引用
        final Jdk8MethodReference methodReference3  = Jdk8MethodReference.create(Jdk8MethodReference::new);
        referenceList.forEach(methodReference3::follow);

    }


     public static Jdk8MethodReference create(final Supplier<Jdk8MethodReference> supplier) {
        return supplier.get();
     }

     public static void collide(final Jdk8MethodReference car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Jdk8MethodReference another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }



}
