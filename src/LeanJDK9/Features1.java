package LeanJDK9;

public class Features1 {

    /**
     *  1、模块化系统
     *  JDK9将JDK分成一组模块，可以在编译时，运行时或构建时进行组合。模块化可以减少内存开销；只需必要的模块，并非全部模块，
     *  可以简化各种类库和大型应用的开发和维护。
     *
     *  如果需要在modelb项目中使用modela项目的内容，必须在modela项目的module-info.java中定义exports com.cnblogs.bean将该目录下可以被其他模块使用，
     *  如果没有写，则包默认是封装在模块下，不被外界使用。而在modela项目中需要使用requires modela导入需要使用的模块名，则可以在modelb中使用modela定义exports的类（即才可以在Test类中使用Person类）。
     *
     *  module-info.java：该文件必须位于项目的根目录中。该文件用于定义模块需要什么依赖，以及那些包被外部使用。
     *
     *  exports：控制着那些包可以被其他模块访问到，所有不被exports的包默认都被封装在模块里面不被外界所使用。
     *
     *  requires：指明对其他模块的依赖。
     *
     *
     */


}
