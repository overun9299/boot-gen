import org.springframework.util.DigestUtils;

/**
 * @Author: liuyue
 * @Date: 2019-06-12 11:02
 */
public class Test {

    public static String initPassword = "123456";
    public static String MD5(String str){
        return DigestUtils.md5DigestAsHex(str.getBytes());
    }
    public static String MD5Init(){
        return DigestUtils.md5DigestAsHex(initPassword.getBytes());
    }
    public static void main(String[] args) {
        System.out.println(Test.MD5Init());
    }
}
