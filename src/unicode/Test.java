package unicode;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Test {
	public static void main(String[] args) {
		String str = gbEncoding("傀儡");
		System.out.println(decodeUnicode(str));
		str = "傀儡";
		for(int i = 0;i<str.length();i++){
			byte[] bs = charToBytes(str.charAt(i));
			for(byte b:bs){
				System.out.println(b);
			}
			System.out.println("=====================");
		}
		//    ^[-A-Z0-9a-z]+:[0-9]+$
		try {
			for(byte b:"傀儡".getBytes("utf8")){
				if(b == 0) continue;
				String hhh = Integer.toHexString(b);
				System.out.println(hhh.substring(hhh.length()-2, hhh.length()));
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(urlEncode("傀儡"));
	}
	//中文转Unicode
    public static String gbEncoding(final String gbString) {   //gbString = "测试"
        char[] utfBytes = gbString.toCharArray();   //utfBytes = [测, 试]
        String unicodeBytes = "";   
        for (int byteIndex = 0; byteIndex < utfBytes.length; byteIndex++) {   
            String hexB = Integer.toHexString(utfBytes[byteIndex]);   //转换为16进制整型字符串
              if (hexB.length() <= 2) {   
                  hexB = "00" + hexB;   
             }   
             unicodeBytes = unicodeBytes + "\\u" + hexB;   
        }   
        System.out.println("unicodeBytes is: " + unicodeBytes);   
        return unicodeBytes;   
    }
    
  //Unicode转中文
    public static String decodeUnicode(final String dataStr) {   
       int start = 0;   
       int end = 0;   
       final StringBuffer buffer = new StringBuffer();   
       while (start > -1) {   
           end = dataStr.indexOf("\\u", start + 2);   
           String charStr = "";   
           if (end == -1) {   
               charStr = dataStr.substring(start + 2, dataStr.length());   
           } else {   
               charStr = dataStr.substring(start + 2, end);   
           }   
           char letter = (char) Integer.parseInt(charStr, 16); // 16进制parse整形字符串。   
           buffer.append(new Character(letter).toString());   
           start = end;   
       }   
       return buffer.toString();   
    }
    
    public static byte[] charToBytes(char c){
    	byte b1=0,b2=0,b3=0,b4=0;
    	if (c<0x80){
    		b1 = (byte)(c>>0 & 0x7F | 0x00);
			b2 = 0;
			b3 = 0;
			b4 = 0;
    	}else if (c<0x0800){
    		b1 = (byte)(c>>6 & 0x1F | 0xC0);
    		b2 = (byte)(c>>0 & 0x3F | 0x80);
    		b3 = 0;
			b4 = 0;
    	}else if (c<0x010000){
    		b1 = (byte)(c>>12 & 0x0F | 0xE0);
    		b2 = (byte)(c>>6 & 0x3F | 0x80);
    		b3 = (byte)(c>>0 & 0x3F | 0x80);
    		b4 = 0;
    	}else if (c<0x110000){
    		b1 = (byte)(c>>18 & 0x07 | 0xF0);
    		b2 = (byte)(c>>12 & 0x3F | 0x80);
    		b3 = (byte)(c>>6 & 0x3F | 0x80);
    		b4 = (byte)(c>>0 & 0x3F | 0x80);
    	}
    	return new byte[]{b1,b2,b3,b4};
    }
    
    private static String urlEncode(String s){
    	try {
			return URLEncoder.encode(s,"utf8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
    	return null;
    }
}
