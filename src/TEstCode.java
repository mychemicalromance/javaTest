import java.io.UnsupportedEncodingException;


public class TEstCode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "";
		byte[] bs = str.getBytes("utf8");
		for(int b:bs){
			if(b > 0){				
				System.out.println(b);
				System.out.println(Integer.toHexString(b));
			}
		}
	}
}
