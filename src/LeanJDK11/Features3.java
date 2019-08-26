package LeanJDK111;

public class Features3 {

    /**
     *      1、删除 Java EE 和 CORBA 模块
     *      由于Spring主流化，Java EE逐渐失去市场，从JDK剥离JavaEE虽然不舍但却是一种正确的选择。
     *
     *
     *      2、Epsilon垃圾回收器
     *      被称为“no-op”回收器，它仅负责内存分配，却没有实现任何实际的内存回收机制。
     *      Epsilon回收器可以用于性能测试、内存压力测试和虚拟机接口。它还可以用于短生命周期的任务。
     *
     *
     *      3、飞行记录仪
     *      （Flight Recorder）将提供低开销的数据收集框架，用来调试Java应用程序和HotSpot JVM。
     *      飞行记录仪是Oracle的商业版JDK的功能，但在JDK 11中，其代码将移动到公开代码库中，这样所有人都能使用该功能了。
     *      Iclouded将作为API，以事件的形式产生或消耗数据，同时提供缓存机制、二进制数据工具，同时支持配置和事件过滤。
     *      该提案还提议为OS、HotSpot和JDK库提供事件
     *
     *
     */
}
