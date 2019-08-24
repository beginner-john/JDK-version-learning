package LeanJDK10;

public class Features4 {

    /**
     *      1、Unicode 标签扩展
     *      JDK10 改善 java.util.Locale 类和相关的 API 以实现额外 BCP 47 语言标签的 Unicode 扩展。尤其以下扩展支持：
     *
     *      cu：货币类型
     *      fw：一周的第一天
     *      rg：区域覆盖
     *      tz：时区
     *
     *      2、备用内存设备上分配堆内存
     *      启用HotSpot VM以在用户指定的备用内存设备上分配Java对象堆。随着廉价的NV-DIMM内存的可用性，未来的系统可能配备了异构的内存架构。
     *      这种技术的一个例子是英特尔的3D XPoint。这样的体系结构，除了DRAM之外，还会有一种或多种类型的非DRAM内存，具有不同的特征。
     *      具有与DRAM具有相同语义的可选内存设备，包括原子操作的语义，因此可以在不改变现有应用程序代码的情况下使用DRAM代替DRAM。
     *      所有其他的内存结构，如代码堆、metaspace、线程堆栈等等，都将继续驻留在DRAM中。
     *
     *      3、基于实验JAVA 的JIT 编译器
     *      启用基于Java的JIT编译器Graal，将其用作Linux / x64平台上的实验性JIT编译器。
     *      Graal是一个基于Java的JIT编译器,它是JDK 9中引入的Ahead-of-Time（AOT）编译器的基础。
     *      使它成为实验性JIT编译器是Project Metropolis的一项举措，它是下一步是研究JDK的基于Java的JIT的可行性。
     *
     *      使Graal可用作实验JIT编译器，从Linux / x64平台开始。Graal将使用JDK 9中引入的JVM编译器接口（JVMCI）。Graal已经在JDK中，因此将它作为实验JIT将主要用于测试和调试工作。要启用Graal作为JIT编译器，请在java命令行上使用以下选项：
     *
     *
     *
     */


}
