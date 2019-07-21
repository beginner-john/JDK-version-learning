package  LeanJDK7;

/**
 * 科目的枚举类
 */
public enum Subjects {

    CHINESE(10,"语文"),
    MATH(10,"数学"),
    ENGLISH(10,"数学");

    private int code;
    private String name;

    Subjects(int code,String name){
        this.code = code;
        this.name = name;
    }

    public int getCode(){
        return code;
    }

    public String getName(){
        return name;
    }

}
