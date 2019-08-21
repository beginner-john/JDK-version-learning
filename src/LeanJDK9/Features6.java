package LeanJDK9;

public class Features6 {

    /**
     *      12、多分辨率图像 API
     *      在 java.awt.image 包下新增了支持多分辨率图片的API，用于支持多分辨率的图片。
     *
     *
     *      13、全新的 HTTP 客服端 API
     *      JDK9 中有新的方式来处理 HTTP 调用。它提供了一个新的HTTP客户端(HttpClient)，它将替代仅适用于blocking模式的HttpURLConnection(HttpURLConnection是在HTTP 1.0的时代创建的，并使用了协议无关的方法)，并提供对 WebSocket 和 HTTP/2 的支持。
     *      此外，HTTP客户端还提供 API 来处理 HTTP/2 的特性，比如流和服务器推送等功能。
     *      全新的 HTTP 客户端 API 可以从 jdk.incubator.httpclient 模块中获取。因为在默认情况下，这个模块是不能根据 classpath 获取的，需要使用 add modules 命令选项配置这个模块，将这个模块添加到 classpath中。
     *
     *      14、智能 JAVA 编译工具
     *      智能 java 编译工具( sjavac )的第一个阶段始于 JEP139 这个项目，用于在多核处理器情况下提升 JDK 的编译速度。如今，这个项目已经进入第二阶段，即 JEP199，其目的是改进 Java 编译工具，并取代目前 JDK 编译工具 javac，继而成为 Java 环境默认的通用的智能编译工具。
     *      JDK 9 还更新了 javac 编译器以便能够将 java 9 代码编译运行在低版本 Java 中。
     *
     *
     */


}
