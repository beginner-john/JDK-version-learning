package LeanJDK7;

import java.io.*;
import java.util.Map;

/**
 * 异常处理
 *
 *
 */
public class NewFeaturesByTryCatch {

    public static void main(String[] args) {

        String filePath = "c:/test.text";
        String toPath = "c:/testCopy.text";
        try {
            copyFile(filePath,toPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     *  try-with-resources语句
     *  JDK7之前，一般都是在finally中关闭socket，文件，数据库连接等资源
     *  JDK7可以帮我们使用完之后自动关闭
     *  实现了AutoCloseable接口的类，都可以帮我们自动关闭。
     *
     */
    public static void copyFile(String filePath,String toPath) throws IOException {

        try(InputStream input = new FileInputStream(filePath);
            OutputStream output = new FileOutputStream(toPath)
            ) {
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len=input.read(bytes)) != -1){
                output.write(bytes,0,len);
            }
        }

    }
}
