package LeanJDK8;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 *  Jdk8 Base64
 *  在当前这个版本，Base64是成为Java类库的标准
 */
public class Jdk8_Base64 {

    public static void main(String[] args) {

        try {
            // 基本编码
            String nameEncode = Base64.getEncoder().encodeToString("jack".getBytes("utf-8"));
            System.out.println(nameEncode);

            // 解码
            byte[] base64DecodeBytes = Base64.getDecoder().decode(nameEncode);
            System.out.println("原始字符串："+ new String(base64DecodeBytes, "utf-8"));


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
