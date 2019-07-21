package LeanJDK7;

/**
 *   LeanJDK7 新特性
 *   switch中使用String
 *   在JDK1.5之前，switch只支持byte，shot，char，int四种基本类型
 *   JDK1.5在switch中增加了枚举类与Byte，Shot，Character，Integer包装类；
 *   这是java编译器在底层进行自动拆箱，而枚举类有一个ordinal方法，该方法实际上是一个int类型的数值。
 *   JDK7开始支持String类型
 */
public class NewFeatures1 {

    public static void main(String[] args) {

        String kemu = Subjects.CHINESE.getName();
        switch (kemu){
            case "语文":
                System.out.println("语文");
                break;
            case "数学":
                System.out.println("英语");
                break;
            case "英语":
                System.out.println("英语");
                break;
            default:
                System.out.println("没有");
        }


    }

}
