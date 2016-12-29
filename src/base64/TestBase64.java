package base64;

import java.util.Arrays;

import org.apache.commons.codec.binary.Base64;

public class TestBase64 {
	public static void main(String[] args) {
	    String base64String = "whuang123";  
        byte[] result = Base64.encodeBase64(base64String.getBytes());
        System.out.println(Arrays.toString(result));
	}
}
