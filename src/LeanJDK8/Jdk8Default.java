package LeanJDK8;

public class Jdk8Default {

    public static void main(String[] args) {

        /**
         *  Jdk8 新增接口的默认方法
         *      接口有实现方法，而且不需要实现类去实现其方法
         *      只需要在方法名前面加个 default 关键字
         *      也可以在方法名前面加个 static, 有同样的效果。
         *
         */

        Vehicle v1 = new Car();
        v1.print();

    }

}

interface Vehicle{

    default void print(){
        System.out.println("我是一辆车");
    }
    // 接口中的抽象方法 可以给默认实现，加default关键字
    static void blowHorn (){
        System.out.println("滴滴滴！");
    }
}
interface FourWheeler {
    default void print () {
        System.out.println("我是一辆四轮车");
    }
}

class Car implements Vehicle,FourWheeler {

   public void print (){
       Vehicle.super.print();
       FourWheeler.super.print();
       Vehicle.blowHorn();
       System.out.println("我是一辆汽车");
   }

}