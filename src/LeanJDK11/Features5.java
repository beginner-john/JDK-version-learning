package LeanJDK111;

public class Features5 {

    /**
     *      1、 弃用 Nashorn JavaScript 引擎
     *      动机
     *        Nashorn JavaScript引擎首先通过JEP 174合并到JDK 8中， 作为Rhino脚本引擎的替代品。它何时发布，它是ECMAScript-262 5.1标准的完整实现。
     *        随着ECMAScript语言构建的快速步伐以及API的调整和修改，我们发现Nashorn难以维护。
     *      非目标
     *        此弃用不会以任何方式影响javax.scriptAPI。
     *      风险和假设
     *        删除Nashorn的风险在于某些应用程序将不再运行，因为期望存在JavaScript。Nashorn使用的广度并不容易追踪。
     *        希望此JEP的反馈可以更好地了解实际的Nashorn使用情况。
     *
     *      2、 弃用 Pack200 工具和 API
     *      动机：
     *          Pack200是JAR文件的压缩方案。弃用原因有三个：
     *          1、Pack200的主要消费者--JDK本身，不在需要它。
     *          2、，客户端应用程序的格局已发生变化，大多数浏览器都不再支持插件。
     *          因此，Pack200的一大类消费者 - 在浏览器中运行的applet - 不再是将Pack200包含在JDK中的驱动程序。
     *          3、总的来说，维护Pack200的成本非常高，并且超过了将其包含在Java SE和JDK中的好处
     *
     *
     *
     */
}
